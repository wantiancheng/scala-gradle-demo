package learn

/**
  * Created by xiaoyue26 on 17/7/14.
  */
// private构造函数以实现单例
class Worker private {
  def work(): Unit = println("I am the only worker!")
}

object Worker {
  val worker = new Worker

  def GetWorkInstance(): Worker = {
    //worker.work
    worker
  }
}
// 单例模式的使用
object Job {
  def main(args: Array[String]) {
    for (i <- 1 to 5) {
      Worker.GetWorkInstance().work()
    }
  }
}
