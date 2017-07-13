/**
  * Created by xiaoyue26 on 17/7/12.
  */
object TestFun {
  def main(args: Array[String]) {
    delayed(time())
    var a = apply(layout, 10)
    println(a)
    var b = apply_2(layout, "abc")
    println(b)

    // 内嵌函数:
    println(factorial(3))
  }

  def time(): Long = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed(t: => Long): Long = {
    // call-by-name 传名调用,类似于宏替换
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  //高阶函数
  def apply(f: Int => String, v: Int): String = f(v)

  def apply_2(f: String => String, v: String): String = f(v)

  // 泛型?
  def layout[A](x: A): String = "[" + x.toString + "]"

  // 内嵌函数:
  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    fact(i, 1)
  }

  // 匿名函数:
  var inc: (Int) = (x: Int) => x + 1 // 或 var inc = (x: Int) => x + 1
  // 等价写法:
  def inc2 = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }


}
