package t5

import scala.beans.BeanProperty

object T5_5_Student {

  def perform: Unit = {
    val student = new T5_5_Student("new", 18)
    println(s"The New $student")
    student.setAge(25)
    student.setName("Garry OldMan")
    println(s"Student changed by bean styled methods $student")
  }
}

class T5_5_Student(@BeanProperty var name: String, @BeanProperty var age: Int) {

  override def toString: String = {
    s"Student('$name', $age)"
  }
}
