package t6

object T6_6_7_CardSuit extends Enumeration {

  val diamonds, hearts, spades, clubs = Value

  def isRed(suit: Value): Boolean = {
    suit.toString match {
      case "diamonds" => true
      case "hearts" => true
      case "spades" => false
      case "clubs" => false
    }
  }

  def perform: Unit = {
    println(s"All card suits: ${values.mkString("[", ",  ", "]")}.")
    T6_6_7_CardSuit.values.foreach(suit => {
      println(s"The suite '${suit}' has red color: it is ${isRed(suit)}.")
    })
  }
}
