package learn.design

/**
  * Created by xiaoyue26 on 17/7/15.
  */
abstract class Role {
  def canAccess(page: String): Boolean
}

class Root extends Role {
  override def canAccess(page: String) = true
}

class SuperAnalyst extends Role {
  override def canAccess(page: String): Boolean = page != "Admin"
}

class Analyst extends Role {
  override def canAccess(page: String) = false
}

//下面的object Role或许命名为RoleFactory更为恰当
//但是考虑到后面在使用它创建对象时 val root = Role("root") 的写法，还是定义为Role为好！

object Role { // 简单工厂(静态工厂)
  def apply(roleName: String): Role = roleName match {
    case "root" => new Root
    case "superAnalyst" => new SuperAnalyst
    case "analyst" => new Analyst
  }

  def main(args: Array[String]): Unit = {
    //创建对象：
    val root = Role("root") //这里等同于Role.apply("root")
    val analyst = Role("analyst")
    List(1, 2, 3) foreach println


  }
}

