/**
  * Created by xiaoyue26 on 17/7/13.
  */
object TestString {
  def main(args: Array[String]): Unit = {
    // 1. StringBuilder
    val buf = new StringBuilder
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString + "\nlength is : " + buf.length)

    //  2. printf与format ( 养成用val的习惯(无副作用的函数式编程习惯) )
    val floatVar: Float = 12.456f
    val intVar: Int = 2000
    val stringVar: String = "string var!"
    val fs1 = printf("浮点型变量为 %f, 整型变量为 %d, 字符串为  %s\n", floatVar, intVar, stringVar)
    // 不能使用String.format, 直接使用 "".format(...)
    val fs2 = "浮点型变量为 %f, 整型变量为 %d, 字符串为  %s\n".format(floatVar, intVar, stringVar)
    println(fs1)
    println(fs2)

  }

}
