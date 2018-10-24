package t5

import org.scalatest.FlatSpec

class T5_7_PersonSpec extends FlatSpec {

  "Person" should "be constructed by string with space with format 'firstName secondName'" in {
    val person = new T5_7_Person("Donald Duck")
    assert(person.firstName == "Donald")
    assert(person.secondName == "Duck")
  }
}
