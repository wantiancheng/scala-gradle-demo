package learn.phase2

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestVariant extends App {
  // +A 表示接受向上转型
  case class Item[+A](a: A) {
    def get: A = a
  }

  abstract class Car() {}

  case class Volvo() extends Car {}

  val c: Item[Car] = Item[Volvo](Volvo())
  val auto = c.get
}
