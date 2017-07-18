package learn.learnCollection

/**
  * Created by xiaoyue26 on 17/7/18.
  */
object TestOption extends App {
  def show(x: Option[String]): String = x match {
    case Some(s) => s
    case None => "?"
  }

  def test1(): Unit = {
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value1")
    println(value2) // None
    println(show(value1))
    println(show(value2))
  }
  // getOrElse 类似于 COALESCE 方法, 在a为None时坍缩到0;在a为Some(5)时,返回5.
  def test2(): Unit = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))
  }

  def test3(): Unit ={
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println("a.isEmpty: " + a.isEmpty )
    println("b.isEmpty: " + b.isEmpty )
  }

  test3()
}
