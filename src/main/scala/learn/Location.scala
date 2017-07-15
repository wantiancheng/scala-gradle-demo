package learn

/**
  * Created by xiaoyue26 on 17/7/12.
  */

// 重写父类字段
class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x)
    println("y 的坐标点 : " + y)
    println("z 的坐标点 : " + z)
  }

  private def touch() {
    println("touch private")
  }
}

object LocationTest {
  def doSomething(): Unit ={

  }
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15)

    // 移到一个新的位置
    loc.move(10, 10, 5)
    //println(TestClass("red"))
    println("here")
    val location=new Location(1,2,3)
    //location.touch()
  }
}


object MainTest {
  def main(args: Array[String]) {
    LocationTest.doSomething()
  }
}
