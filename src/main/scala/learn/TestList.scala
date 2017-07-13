package learn

/**
  * Created by xiaoyue26 on 17/7/13.
  */
object TestList {
  def main(args: Array[String]): Unit = {
    test2()
  }

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
    // 字符串列表
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
    val empty = Nil

  }

  def test2(): Unit = { // head\tail\ reverse
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums = Nil
    println("第一网站是 : " + site.head)
    println("最后一个网站是 : " + site.tail) // tail返回除了head的剩余List
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println( "site 反转后 : " + site.reverse )

    println("查看 nums 是否为空 : " + nums.isEmpty)
  }

  def test3(): Unit = { // List 连接 :::
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符
    var fruit = site1 ::: site2
    println("site1 ::: site2 : " + fruit)

    // 使用 Set.:::() 方法
    fruit = site1.:::(site2)
    println("site1.:::(site2) : " + fruit)

    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println("List.concat(site1, site2) : " + fruit)
  }


}
