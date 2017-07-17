package learn.phase1

/**
  * Created by xiaoyue26 on 17/7/13.
  */
object TestList {
  def main(args: Array[String]): Unit = {
    test5()
  }

  // tips:
  // 优先使用 ++ 而不是 :::
  // 优先使用 +: 而不是 ::


  def test1(): Unit = { // 列表List , 看网上描述似乎和数组的区别它是一个链表? (有点诡异)
    val dim2: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    dim2.foreach(arg => {
      arg.foreach(a => print(a + " "))
      println()
    }
    )
    // 字符串列表 // def ::(x: A): List[A]
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表 // 好像没必要加括号 x::list, 这个运算符自动有右边优先规则, 先会自动计算 4::Nil
    // 需要记 //  :: 是右边优先 // 等价于 +:  // 优先使用 +: , 它是一个Seq的方法, 而且含义更清晰
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    val nums2 = 1 :: 2 :: 3 :: 4 :: Nil
    nums.foreach {
      n => println(n)
    }
    nums2.foreach {
      n => println(n)
    }

    // 空列表
    val empty = Nil

  }

  def test2(): Unit = { // head\tail\ reverse
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums = Nil
    println("第一网站是 : " + site.head)
    println("最后一个网站是 : " + site.tail) // tail返回除了head的剩余List
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println("site 反转后 : " + site.reverse)
    println("查看 nums 是否为空 : " + nums.isEmpty)
  }

  def test3(): Unit = { // List 连接 :: https://segmentfault.com/a/1190000005083578
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符 (顺序连接) (尾插法)
    var fruit = site1 ::: site2 // List方法
    println("site1 ::: site2 : " + fruit)

    // 使用 Set.:::() 方法 // 头插法 (在site1的头部插入site2)  // x::list等价于list.::(x))  // Set方法
    fruit = site1.:::(site2)
    println("site1.:::(site2) : " + fruit)

    // 使用 concat 方法 // 顺序连接 (尾插法)  List方法
    fruit = List.concat(site1, site2)
    println("List.concat(site1, site2) : " + fruit)

    // 使用 ++ // 集合方法
    val fruit2 = site1 ++ site2
    println(fruit2)


  }

  def test4(): Unit = { // +: // :+  // 顺序不用记, 顺序连接,冒号靠近集合类型
    //  def +:(elem: A): List[A]
    //  def :+(elem: A): List[A]
    // 冒号靠近集合类型, 另一个强行被视为元素

    val x = List(1)
    val y = 2 +: x
    println(x)
    println(y)

    // :+
    val z = y :+ x
    println(z)

  }

  def test5(): Unit = { //List=>String
    //addString // 可以定义分隔符\ 开始符\ 结束符
    val a = List(1, 2, 3, 4)
    val b = new StringBuilder()
    println(a.addString(b, ","))
    //mkString // 同AddString,但不借助StringBuilder
    println(a.mkString("\t"))
  }
}
