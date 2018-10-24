package t5

import org.scalatest.FlatSpec

class T5_5_StudentSpec extends FlatSpec {

  "Student" should "have workings bean styled properties" in {
    val student = new T5_5_Student("name", 23)
    validate(student, "name", 23)
    student.setAge(87)
    student.setName("OldBoy")
    validate(student, "OldBoy", 87)
  }

  def validate(student: T5_5_Student, name: String, age: Int): Unit = {
    assert(student.getName == name)
    assert(student.getAge == age)
  }
}
