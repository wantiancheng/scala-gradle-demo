package learn.phase2

/**
  * Created by xiaoyue26 on 17/7/17.
  */

trait Debugger {
  def log(message: String) {
    println(message)
  }
}

class Worker {
  def work() {
    println("working innocently")
  }
}

object TestLogger extends App {
  val worker = new Worker() with Debugger
  worker.work()
  worker.log("log here")
}
