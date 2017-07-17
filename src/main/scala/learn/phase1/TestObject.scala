package learn.phase1

import learn.design.TestSingleton

/**
  * Created by xiaoyue26 on 17/7/15.
  */
class TestObject {
  val a: Int = 1
}

object TestObjectTest {
  var testobj: TestObject = _ // 所有类型的初始值

  def main(args: Array[String]): Unit = {
    TestSingleton working() // 以空格代替 . 的调用风格
    var tobj = new MongoClient() // 一次
    //println(testobj.a)

  }
}

class MongoClient(var host: String, var port: Int) {
  println("default")

  def this() = { // 重载构造函数
    this(null, 0)
    println("overload")
    host = "127.0.0.1"
    port = 27017
    require(host != null, "Have to provide host name")
  }
}