package learn.learnCollection

/**
  * Created by xiaoyue26 on 17/7/18.
  */
object TestSet extends App {
  def test1() {
    val set = Set(1, 2, 3) // 默认是不可变集合 scala.collection.immutable.Set
    println(set.getClass.getName) //
    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)
  }

  // 不可变Set进行操作，会产生一个新的set，原来的set并没有改变  // immutable
  //   可变Set则会使用原来的Set   //  mutable
  def test2(): Unit = {
    import scala.collection.mutable // 可以在任何地方引入 可变集合
    val mutableSet = mutable.Set(1, 2, 3)
    println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet

    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2

    println(mutableSet) // Set(5, 3, 4)

    val another = mutableSet.toSet
    println(another.getClass.getName) // scala.collection.immutable.Set$Set3
  }

  // ++  运算符(会去重)
  def test3(): Unit = {
    val site1 = Set("Runoob", "Google", "Baidu")
    val site2 = Set("Faceboook","Google", "Taobao")

    // ++ 作为运算符使用
    var site = site1 ++ site2
    println("site1 ++ site2 : " + site)

    //  ++ 作为方法使用
    site = site1.++(site2)
    println("site1.++(site2) : " + site)
  }

  test3()

}
