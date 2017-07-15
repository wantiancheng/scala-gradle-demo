package learn.design

/**
  * Created by xiaoyue26 on 17/7/15.
  */
// 1. 私有构造函数
class TestSingleton private {
  def working(): Unit = {
    println("working")
  }
}

object TestSingleton {
  var obj: TestSingleton = _ // 2. 懒汉模式,先初始化为null
  def working(): Unit = {
    apply()
    obj.working()
  }

  def apply(): Unit = {
    if (obj == null) {
      obj = new TestSingleton
      obj
    }
    else
      obj
  }

}
