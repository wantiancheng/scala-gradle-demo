package learn.learnCollection

/**
  * Created by xiaoyue26 on 17/7/18.
  */
object TestTuple extends App {
  // 元组与List的不同: 元组可以包含不同的元素
  // 如 (99, "runoob") 是 Tuple2[Int, String]
  def test1(): Unit = {
    val t1 = (1, 3.14, "Fred")
    val t = (4, 3, 2, 1)
    val sum = t._1 + t._2 + t._3 + t._4
    println("元素之和为: " + sum)

  }

  // 迭代器 productIterator iterator
  def test2(): Unit = {
    val t = (4, 3, 2, 1)
    t.productIterator foreach println

  }

  def test3(): Unit = {
    val t = Tuple3(1, "hello", Console)
    println("连接后的字符串为: " + t.toString()) // (1,hello,scala.Console$@706a04ae)
  }

  // swap
  def test4(): Unit = {
    val t = Tuple2("www.google.com", "www.runoob.com")
    println("交换后的元组: " + t.swap)
  }

  test4()

}
