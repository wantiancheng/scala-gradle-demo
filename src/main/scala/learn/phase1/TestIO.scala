package learn.phase1

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestIO {
  def testFileIO(): Unit = {
    val writer = new PrintWriter(new File("test.out"))
    writer.write("output from TestIO")
    writer.close()
  }

  def testConsole(): Unit = {
    println("start your input:")
    val line = StdIn.readLine()
    println("receive: " + line)

  }

  def testReadFile(): Unit = {
    Source.fromFile("test.out").foreach {
      print
    }
  }

  def main(args: Array[String]): Unit = {
    //testConsole()
    testReadFile()

  }
}
