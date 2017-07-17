package learn.phase1

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

    // 3. 字符串插值: s , f 和 raw
    test3() // 也可以写test3


  }

  def test3(): Unit = { // 以下特性在 2.10.0 之后生效
    // (1) s 插值
    val name = "James"
    println(s"Hello,$name\n")
    println(s"1+1=${1 + 1}") // 2
    // (2) f 插值  太难看懂了,还是用format函数吧
    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall") // James is 1.90 meters tall


    // (3) raw 插值 转义变量,不转义控制字符.
    println(raw"a\nb$name")

  }
}
