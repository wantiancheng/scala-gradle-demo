package learn

/**
  * Created by xiaoyue26 on 17/7/15.
  */
abstract class Element {
  def contents: Array[String] // 1. 测试点1: 这里的 def 如果改成 val, 则 height和width的赋值要注释掉.

  val height: Int = contents.length
  val width: Int = if (height == 0) 0 else contents(0).length
}

class UniformElement(ch: Char,
                     override val width: Int,
                     override val height: Int
                    ) extends Element {
  private var line = ch.toString * width
  println("Initialize done")

  // 重载抽象类的成员,因此不需要 override 关键字
  def contents: Array[String] = {
    println("override done")
    Array.fill(height)(ch.toString * width)
    //Array.fill(height)(line) // 2. 测试点2: 这行有null异常,因为先执行了父类的函数体,父类调了这里,而子类还没有实例化.
  }


}

object test { // def隐藏的调用次数, 父类中调用了两次contents,main函数中调用了一次.
  def main(args: Array[String]): Unit = {
    val ue = new UniformElement('x', 2, 3)
    ue.contents foreach println
  }
}

