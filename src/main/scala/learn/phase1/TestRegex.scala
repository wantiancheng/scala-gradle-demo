package learn.phase1

import scala.util.matching.Regex

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestRegex {

  def main(args: Array[String]): Unit = {
    // 1. findFirstIn
    val pat = "scala".r
    val str = "here scala is"
    println(pat findFirstIn str)
    println(pat findFirstMatchIn str)

    // 2. findAllIn
    val str2 = "here scala is and here scala again"
    val pat2 = new Regex("scala")
    println(pat2 findAllIn str2 mkString ",")
    val res = pat2 findAllIn str2
    res foreach println
    println(res.getClass)

    // 3. 忽略转义
    val str3 = "asdf 123 kk 12"
    val pat3 = raw"\d+".r // 等效于  "\\d+".r  // 使用正则时,使用raw关键字来省略多余的斜杠\,忽略控制字符的转义
    pat3 findAllIn str3 foreach println


  }

}
