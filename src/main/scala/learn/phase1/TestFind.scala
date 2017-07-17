package learn.phase1

/**
  * Created by xiaoyue26 on 17/7/15.
  */
object TestFind {
  def testFind() {
    val x = List(1, 2, 3, 4)
    val y = x.find(_ % 3 == 0)
    val z = x.find(_ % 7 == 0)
    println(y)
    println(z)
  }

  def testTakeWhile() {
    // stop while fail
    val input = List(1, 2, 3, -4, 5, 6, 7, 8, 9, 10)
    val out = input takeWhile (_ > 0)
    println(out)

  }

  def testFlatMap() {
    val input = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val out = input flatMap (_.map(_ + 1))
    val out2 = input flatMap (_.reverse)
    println(out)
    println(out2)
  }

  def testflatten() {
    val input = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val out = input.flatten
    println(out)
  }

  def TestSum(list: List[Int]): Int = list match {
    case Nil => 1
    case n :: rest => n + TestSum(rest)   //  n :: rest 表示一个非空的列表 // List只有两个实现类\Case class,分别是::和Nil
  }

  def testReduceLeft() {
    println(List.range(1, 10).reduceLeft(_ + _)) // 起始元素为List的首部
    println(List.range(1, 10).sum) // println(List.range(1, 10).reduceLeft(_ + _))
    println(List.range(1, 4))
    println(List.range(1, 4).foldLeft(2)(_ * _)) // 起始元素为2,然后才是List的首部
  }

  def main(args: Array[String]): Unit = {
    testReduceLeft()
  }

}
