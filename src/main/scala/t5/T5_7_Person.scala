package t5

import util.ValidationTools

object T5_7_Person {

  def perform: Unit = {
    val person = new T5_7_Person("Amsterdam Petrovsky")
    println(s"The $person with firstName(${person.firstName}) and secondName(${person.secondName}).")
  }
}

class T5_7_Person(private[this] val name: String) extends ValidationTools {

  private[this] val nameParts = name.split(" ")
  checkArgument(nameParts.length == 2, "The parameter name must contains one space!")
  val firstName = nameParts(0)
  val secondName = nameParts(1)

  override def toString: String = {
    s"Person($firstName, $secondName)"
  }
}
