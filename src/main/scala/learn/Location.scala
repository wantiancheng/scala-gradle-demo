package learn

/**
  * Created by xiaoyue26 on 17/7/12.
  */


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
}

object LocationTest {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15)

    // 移到一个新的位置
    loc.move(10, 10, 5)
  }
}