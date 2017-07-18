package learn.phase2

/**
  * Created by xiaoyue26 on 17/7/18.
  */

class Earth {
  def sound() {
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound() {
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() {
    print("bird sounds")
  }
}

object TestClassPass extends App {
  def biophony[T <: Animal](things: Seq[T]): Unit = things foreach (_.sound())

  biophony(Seq(new Bird, new Bird))


}
