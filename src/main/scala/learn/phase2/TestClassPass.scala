package learn.phase2

import scala.reflect.ClassTag

/**
  * Created by xiaoyue26 on 17/7/18.
  */

class Earth {
  def sound() {
    println("earth sound")
  }
}

class Animal extends Earth {
  override def sound() {
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() {
    println("bird sounds")
  }
}

class Moon {
  def sound() {
    println("moon sounds")
  }
}

//  <: 上边界 T必须是Animal的子类(含Animal)
//  >: 下边界 T必须是Animal的父类(含Animal)
object TestClassPass extends App {

  def test1(): Unit = {
    // T <: Animal的意思是：T必须是Animal的子类(<=)
    def biophony[T <: Animal](things: Seq[T]): Unit = things foreach (_.sound())

    biophony(Seq(new Bird, new Bird)) //OK
    biophony(Seq(new Animal, new Bird)) //OK
    // biophony(Seq(new Earth, new Earth)) // wrong

  }

  def test2(): Unit = {
    // >: 传入 Animal的父类或自身, 此时若传入子类,则会被自动向上转型成Animal指针,但实际调用的依然是子类方法
    def biophony[T >: Animal](things: Seq[T]) = things

    biophony(Seq(new Earth, new Animal)) foreach (_.sound()) //OK
    biophony(Seq(new Earth, new Bird)) foreach (_.sound()) // OK 但隐藏了向上转型,实际调用的依然是子类方法
    val res = biophony(Seq(new Earth, new Moon)) //  foreach (_.sound()) // wrong // 此时全部都转成了Object, 因此只能调Object的方法了
    res foreach {
      arg => println(arg.getClass)
    }
  }

  test2()

}
