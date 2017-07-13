import learn.Person

object ScalaDemo {
  def main(args: Array[String]): Unit = {
    println("Hello world from scala")
    var person = new Person("crazyName", 100, "male")
    person.show()
  }
}