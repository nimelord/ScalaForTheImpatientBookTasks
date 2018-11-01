package t6

import org.scalatest.FlatSpec

class T6_6_7_CardSuitSpec extends FlatSpec {

  it should "return correct result by toString" in {
    assert(T6_6_7_CardSuit.diamonds.toString == "diamonds")
    assert(T6_6_7_CardSuit.hearts.toString == "hearts")
    assert(T6_6_7_CardSuit.spades.toString == "spades")
    assert(T6_6_7_CardSuit.clubs.toString == "clubs")
  }

  it should "correct define color of incoming suit" in {
    assert(T6_6_7_CardSuit.isRed(T6_6_7_CardSuit.diamonds))
    assert(T6_6_7_CardSuit.isRed(T6_6_7_CardSuit.hearts))
    assert(!T6_6_7_CardSuit.isRed(T6_6_7_CardSuit.spades))
    assert(!T6_6_7_CardSuit.isRed(T6_6_7_CardSuit.clubs))
  }
}
