package learn

import java.util.Date

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

    // 匿名函数:
    var inc: Int => Int = (x: Int) => x + 1 // 简写: var inc = (x: Int) => x + 1

    // 等价写法:
    def inc2 = new Function1[Int, Int] { // 一个参数的函数 Function1 0个参数的函数:Function0 // 函数对象是一等公民
      def apply(x: Int): Int = x + 1 // 所有对象都有apply方法, 调用时可以直接用括号调用,如 A() 其实是调用了 A.apply()
    }

    println(inc2(3))

    var x = inc(7) - 1
    // 多个参数:
    val mul = (x: Int, y: Int) => x * y
    println(mul(3, 4))
    // 无参:
    var userDir = () => {
      System.getProperty("user.dir")
    }
    println(userDir())

    // 偏应用函数, 类似于求偏导,把两个参数的函数转化成一个参数的函数(其中一个参数变成定值或者绑定指定变量)
    var date = new Date
    val logWithDateBound = log(date, _: String) // 第一个参数绑定,第二个参数维持还是变量
    logWithDateBound("message1")
    Thread.sleep(1000)
    date = new Date
    logWithDateBound("message2")

    // 函数柯里化(Currying)
    // def add(x:Int,y:Int)=x+y // 原函数
    def add(x: Int)(y: Int): Int = x + y // currying化后. 简写: def add(x: Int)(y: Int) = x + y
    println(add(1)(2))

    // Currying的本质是scala语法支持参数列表
    // def fun1 参数列表1,参数列表2...
    // 参数列表1 = (参数1,参数2,参数3...)
    def funCurryingTest()(x: Int)()(y: Int) = {
      x + y
    }

    // Currying用法
    // 第二个参数列表有一个参数,这个参数名叫thunk
    // thunk的类型是一个无参映射, =>Any, 无参映射到Any (返回值为Any的无参函数)
    // 函数实体是 n 次运行 thunk
    def repeat(n: Int)(thunk: => Any): Unit = (1 to n) foreach { _ => thunk }

    repeat(2) {
      println("Hello, world")
    }

    // 参数是一个函数到Unit的函数, 前一个函数则是一个无参函数,返回是Any,任意类型
    def twice: (=> Any) => Unit = repeat(2)


    twice { // 类似于groovy,唯一参数时函数的时候,可以作为闭包直接传递. 省略圆括号
      println("Hello, world")
    }


    // 函数指针+匿名函数 写法:
    def add2(x: Int): Int => Int = (y: Int) => x + y // 简写: def add2(x: Int) = (y: Int) => x + y

    println(add2(1)(2))

    // 闭包:
    var more = 1
    val addMore = (x: Int) => x + more
    println(addMore(10))
    more = 2
    println(addMore(10))

    // 函数式编程:
    def formatArgs(args: Array[String]) = args.mkString("\n") // 类似于join

    println(formatArgs(args))
    val res = formatArgs(Array("zero", "one", "two"))
    assert(res == "zero\none\ntwo")

    Array.apply("1", "2").foreach {
      args => println(args)
    }
  }

  def log(date: Date, message: String): Unit = {
    println(date + "----" + message)
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


}
