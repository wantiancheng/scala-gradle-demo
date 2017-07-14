package learn

/**
  * Created by xiaoyue26 on 17/7/14.
  */
// 私有构造函数
class TestClass private(val color: String) {
  println("创建" + this)

  override def toString: String = "颜色标记：" + color
}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object TestClass {

  private val markers: Map[String, TestClass] = Map(
    "red" -> new TestClass("red"),
    "blue" -> new TestClass("blue"),
    "green" -> new TestClass("green")
  )

  def apply(color: String): TestClass = {
    if (markers.contains(color)) markers(color) else null
  }


  def getMarker(color: String): TestClass = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    println(TestClass("red")) // 调用apply
    // 单例函数调用，省略了.(点)符号
    println(TestClass getMarker "blue")

    println(getMarker("blue"))

    println(apply("green"))
  }
}
