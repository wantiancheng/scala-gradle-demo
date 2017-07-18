package learn.phase2

/**
  * Created by xiaoyue26 on 17/7/18.
  */
object TestType extends App {
  def test1(): Unit = {
    def typeOf[T](v: T): String = v match {
      case _: Int => "Int"
      case _: String => "String"
      case _ => "Unknown"
    }

    type S = String
    val objS: S = "string of S"
    println(typeOf(objS))
    println(classOf[S])


  }

  def test2(): Unit = {
    type T = Serializable {
      type X
      def foo(): Unit
    }
  }

  // ClassTag
  def test3(): Unit = {
    import scala.reflect.ClassTag
    def f[T](v: T)(implicit ev: ClassTag[T]) = ev.toString

    type S = String
    val objS: S = "string of S"
    println(f(objS))
  }

  // 动态类型检测
  def test4(): Unit = {
    import scala.reflect.ClassTag
    def f[A, B: ClassTag](a: A, b: B) = a match {
      case _: B => "A is a B"
      case _ => "A is not a B"
    }

    val x = 'c'
    val y = 5
    val z: Any = 5
    println(f(x, y)) // A (Char) is not a B (Int)
    println(f(x, z)) // A (Char) is a B (Any)
  }

  // getClass
  def test5(): Unit = {
    val x: Any = 5
    val y = 5
    import scala.reflect.ClassTag
    def f(a: Any, b: Any) = {
      val B = ClassTag(b.getClass)
      ClassTag(a.getClass) match {
        case B => "a is the same class as b"
        case _ => "a is not the same class as b"
      }
    }

    println(f(x, y) == f(y, x)) // 自反性

  }

  def test6(): Unit = {
    import scala.reflect.runtime.universe.TypeTag
    def f[A, B](a: A, b: B)(implicit evA: TypeTag[A], evB: TypeTag[B]) = evA == evB
    /*def f[A, B: TypeTag](a: A, b: B) = a match {
      case _: B => "A is a B"
      case _ => "A is not a B"
    }*/

    type X = Int // here
    val x: X = 5
    val y = 5
    println(f(x, y)) // false, X is not the same type as Int
  }

  test5()
}
