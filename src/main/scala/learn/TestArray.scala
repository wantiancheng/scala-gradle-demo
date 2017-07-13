package learn

/**
  * Created by xiaoyue26 on 17/7/13.
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    test5()
  }

  def test1(): Unit = { // 值得注意的是访问数组元素用的是小括号而不是中括号
    var ar1 = new Array[String](3)
    var ar2: Array[String] = new Array[String](3)
    ar1(0) = "str1"
    for (x <- ar1) {
      println(x)
    }
  }

  def test2(): Unit = {
    // 计算数组所有元素的总和
    var total = 0.0
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    for (i <- myList.indices // 等价于 i <- 1 to myList.length-1 // 等价于 i <- 1 until myList.length
         if i > 0 // 直接加上过滤条件
         if i < 100 // 多个过滤条件分号分隔或者换行分隔
    ) {
      total += myList(i)
    }
    // to 包括最后一个元素
    // until 不包括最后一个元素
    // 两者都返回一个Range对象
    println("总和为 " + total)

  }

  def test3(): Unit = { //多维数组
    var myMatrix = Array.ofDim[Int](3, 3)
    // 创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }
    // 打印二维阵列
    for (row <- myMatrix;
         cell <- row
    ) {
      print(" " + cell)
      if (cell == 2) println()
    }
  }

  def test4(): Unit = {
    // 合并数组
    import Array._
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = concat(myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3) {
      println(x)
    }
  }

  def test5(): Unit = { // range函数
    import Array._
    var myList1 = range(10, 20, 2) // step=2
    var myList2 = range(10, 20)

    // 输出所有数组元素
    for (x <- myList1) {
      print(" " + x)
    }
    println()
    for (x <- myList2) {
      print(" " + x)
    }

  }
}