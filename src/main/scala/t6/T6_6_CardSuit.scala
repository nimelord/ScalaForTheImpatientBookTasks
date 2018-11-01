package t6

object T6_6_CardSuit extends Enumeration {

  val diamonds, hearts, spades, clubs = Value

  def perform: Unit = {
    println(s"All card suites: ${values.mkString("[", ",  ", "]")}.")
  }
}
