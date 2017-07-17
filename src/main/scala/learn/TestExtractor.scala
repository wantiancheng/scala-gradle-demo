package learn

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestExtractor {

  object egObj {
    def apply(x: Int): Int = x * 2

    def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None
  }

  //test unapply, Option
  def testUnapply(): Unit = {
    // 注入方法 (可选)
    def apply(user: String, domain: String) = {
      user + "@" + domain
    }

    // 提取方法（必选）
    def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      if (parts.length == 2) {
        Some(parts(0), parts(1))
      } else {
        None
      }
    }

    println("Apply 方法 : " + apply("Zara", "gmail.com"))
    println("Unapply 方法 : " + unapply("Zara@gmail.com"))
    println("Unapply 方法 : " + unapply("Zara Ali"))
  }

  def testMatch(): Unit = {
    val x = egObj(5)
    println("x = " + x)
    x match {
      case egObj(num) => println(x + " = " + num + " *2 ")
      case _ => println("invalid obj")
    }
  }

  def main(args: Array[String]): Unit = {
    // testUnapply()
    testMatch()
  }

}
