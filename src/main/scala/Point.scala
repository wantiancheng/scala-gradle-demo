/**
  * Created by xiaoyue26 on 17/7/12.
  */
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc
  // _是对应类型的默认值
  var test: Int = _

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
}

object Test {
  def main(args: Array[String]) {
    val point = new Point(10, 20)
    printPoint

    def printPoint {
      println("x 的坐标点 : " + point.x)
      println("y 的坐标点 : " + point.y)
      println("test 的_值 : " + point.test)
    }

    // 变长参数:
    def echo(args: String*) = for (arg <- args) println(arg)

    def echoNum(args: Int*) = for (arg <- args) println(arg)

    echo("a", "b")
    // 传参数技巧:
    val arr = Array("What's", "up", "doc?")
    //echo(arr) // 类型不匹配
    echo(arr: _*) // 传参同时进行转换

    val s = 1 to 5
    //echoNum(1 to 5: _*)
    val a = s.filter(_ % 2 == 0).map(2 * _)
    for (arg <- a) println(arg)
    val aSorted = a.sorted
    for (arg <- aSorted) println(arg)
    // 匿名函数
    val after = a.sortWith(_.compareTo(_) > 0)
    for (arg <- after) println(arg)

    var arr_list = List(1 to 5: _*)
    val (first, _) = (1, 2)
    println(first)


    val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val num1 = nums.sortWith(_ > _)
    echoNum(num1: _*)
    val num2 = nums.sortWith(_ < _)

    println((1, 2)._2)

    var m3 = Map((1, 100), (2, 200))
    for (e <- m3) println(e._1 + ": " + e._2)
    println(m3 filter (e => e._1 > 1))
    println(m3 filterKeys (_ > 1))
    println(m3 map (e => (e._1 * 10, e._2)))

    val vals = m3.values
    for (arg <- vals) println(arg)


    // yield 用法
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // for 循环
    var retVal = for {a <- numList
                      if a != 3; if a < 8
    } yield a

    // 输出返回值
    for (a <- retVal) {
      println("Value of a: " + a)
    }


  }
}
