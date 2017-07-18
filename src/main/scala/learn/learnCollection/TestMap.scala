package learn.learnCollection

/**
  * Created by xiaoyue26 on 17/7/18.
  */
object TestMap extends App {
  def test1(): Unit = {
    // 空哈希表，键为字符串，值为整型
    var A: Map[Char, Int] = Map()
    // Map 键值对演示
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    A += ('I' -> 1)
    A += ('J' -> 5)
    A += ('K' -> 10)
    A += ('L' -> 100)
    println(A)
  }

  def test2(): Unit = {
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println("colors 中的键为 : " + colors.keys)
    println("colors 中的值为 : " + colors.values)
    println("检测 colors 是否为空 : " + colors.isEmpty)
    println("检测 nums 是否为空 : " + nums.isEmpty)
  }

  //  ++ 作为运算符
  def test3(): Unit = {
    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    //  ++ 作为运算符
    var colors = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors)

    //  ++ 作为方法
    colors = colors1.++(colors2)
    println("colors1.++(colors2)) : " + colors)
  }

  def test4(): Unit ={
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + sites(i) )}
  }
  //contains
  def test5(): Unit ={
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    if( sites.contains( "runoob" )){
      println("runoob 键存在，对应的值为 :"  + sites("runoob"))
    }else{
      println("runoob 键不存在")
    }
    if( sites.contains( "baidu" )){
      println("baidu 键存在，对应的值为 :"  + sites("baidu"))
    }else{
      println("baidu 键不存在")
    }
    if( sites.contains( "google" )){
      println("google 键存在，对应的值为 :"  + sites("google"))
    }else{
      println("google 键不存在")
    }
  }
  test5()
}
