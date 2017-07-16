package learn.design

/**
  * Created by xiaoyue26 on 17/7/16.
  */
abstract class Term

case class Var(name: String) extends Term

case class Fun(arg: String, body: Term) extends Term

case class App(f: Term, v: Term) extends Term

object TermTest extends scala.App { // 这样就不需要main函数了
  def printTerm(term: Term) {
    // 左边的ide提示的圈,提示这是一个递归函数
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
        printTerm(b)
      case App(f, v) =>
        print("(")
        printTerm(f)
        print(" ")
        printTerm(v)
        print(")")
    }
  }

  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }

  val id = Fun("x", Var("x"))
  val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
  printTerm(id)
  println
  printTerm(t)
  println
  println(isIdentityFun(id))
  println(isIdentityFun(t))
}