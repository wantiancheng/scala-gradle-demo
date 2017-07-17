package learn.phase2


/**
  * Created by xiaoyue26 on 17/7/17.
  */
object ColorEnum extends Enumeration {
  val red, green, blue, pink = Value
  val yellow = Value(12, "huang") //可以随意指定id和名称，但是避免重复
  val purple = Value("zi") //id为13
  val orange = Value(20)
}

object TestEnumeration extends App {
  //   1. before import
  println("id=%d name=%s".format(ColorEnum.blue.id, ColorEnum.blue))

  //   2. after import
  import ColorEnum._

  println("id=%d name=%s".format(yellow.id, yellow))
}
