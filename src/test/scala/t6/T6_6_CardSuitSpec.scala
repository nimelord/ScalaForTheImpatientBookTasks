package t6

import org.scalatest.FlatSpec

class T6_6_CardSuitSpec extends FlatSpec {

  it should "return correct result by toString" in {
    assert(T6_6_CardSuit.diamonds.toString == "diamonds")
    assert(T6_6_CardSuit.hearts.toString == "hearts")
    assert(T6_6_CardSuit.spades.toString == "spades")
    assert(T6_6_CardSuit.clubs.toString == "clubs")
  }
}
