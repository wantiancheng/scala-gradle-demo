/**
  * Created by xiaoyue26 on 17/7/11.
  */
//1.主构造器在类名后,参数会被声明字段,若参数没有使用var或者val声明，则会被声明称私有字段
//2.实例化类的时候,类中的语句会被执行:println("person")
class Person(name: String, var age: Int) {
  println("person")

  def show(): Unit = {
    println("show.." + name)
  }

  var gender: String = _

  //次构造器必须调用主构造器,参数不能使用var
  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  // 显式重载toString方法,否则语法报错
  override def toString: String = getClass.getName + "[name=" + name + "]"


}


object PersonTest { // 伴生对象, 单例
  def main(args: Array[String]): Unit = {
    var person = new Person("crazyName", 100, "male")
    person.show()
    println(person)
  }
}
