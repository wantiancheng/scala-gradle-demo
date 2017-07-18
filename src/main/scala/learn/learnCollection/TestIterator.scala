package learn.learnCollection

/**
  * Created by xiaoyue26 on 17/7/18.
  */
object TestIterator extends App {
  def test1(): Unit = {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext) {
      println(it.next())
    }
  }
  def test2(): Unit ={
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("最大元素是：" + ita.max )
    println("最小元素是：" + itb.min )
  }
  def test3(): Unit ={
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("ita.size 的值: " + ita.size )
    println("itb.length 的值: " + itb.length )
  }

  test3()

}
