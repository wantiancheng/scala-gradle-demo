package learn.phase2

import collection.mutable

/**
  * Created by xiaoyue26 on 17/7/17.
  */
object TestCache extends App {
  println(1 -> 2)
}

class ChecksumAccumulator {
  def checksum(): Int = { // 具体的校验和算法
    1 // dump one
  }

  def add(toByte: Byte): Unit = {
    // 计算校验和前准备数据
  }
}

object ChecksumAccumulator { // 累加计算String的校验和
  private val cache = mutable.Map[String, Int]()

  def calculate(s: String): Int = // 计算且缓存
    if (cache.contains(s))
      cache(s) // return value
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte) // 添加check sum的输入
      val cs = acc.checksum() // 计算acc的check sum
      cache += (s -> cs) // 加入map中 , 等价写法: cache += ( (s, cs) )  // s->cs是映射,map中存的实际上也是映射,或者说元组
      cs
    }
}
