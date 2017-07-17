package learn

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestException {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>
        println("Missing file exception")
      case ex: IOException =>
        println("IO Exception")
      case ex: Throwable =>
        println("Exception")
    }
    finally {
      println("Exiting finally...")
    }
  }

}
