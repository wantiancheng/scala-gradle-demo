package learn

/**
  * Created by xiaoyue26 on 17/7/16.
  */
package object learnclass {
  // 一切皆对象,因此包对象就是包的伴生对象
  // 可以重命名一些类型,解决版本兼容的问题
  type HashMap[A, B] = scala.collection.mutable.HashMap[A, B]


}
