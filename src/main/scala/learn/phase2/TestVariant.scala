package learn.phase2

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestVariant extends App {

  sealed abstract class Car() {}

  class Volvo() extends Car {}

  class VolvoWagon() extends Volvo
  // 泛型中默认是强类型,不允许上下转型
  // +A 表示接受向上转型
  case class Item[+A](a: A) {
    def get: A = a
  }
  // -A 表示接受向下转型
  case class Check[-A]() {
    def check(a: A) {}
  }

  val c: Item[Car] = new Item[Volvo](new Volvo) // 用父类指针接了子类
  println("pass item")

  val d:Check[VolvoWagon]= new Check[Volvo]() // 用子类指针接了父类
  println("pass check")

  val e:Volvo=new VolvoWagon() // 普通类型的话, 本来就可以用父类指针接子类
}
