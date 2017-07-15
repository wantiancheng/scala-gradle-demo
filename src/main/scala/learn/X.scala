package learn

/**
  * Created by xiaoyue26 on 17/7/15.
  */
class X {
  // class X能获取object X的私有成员
  // 用前缀的方式调用object的方法
  def m(x: Int): Unit = X.f(x)

  // 显示的导入object X的方法后,可以省略'X.'
  import X._

  def n(x: Int): Unit = f(x)

  private def o = 2
}

object X {
  private def f(x: Int) = x * x

  // object X能够获取class X的成员
  def g(x: X): Int = {
    //import X._
    x.o * x.o
  }

  def main(args: Array[String]): Unit = {
    var x = new X()
    println(X.g(x))
  }
}
