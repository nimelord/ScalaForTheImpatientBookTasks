package t4

import org.scalatest.FlatSpec

class T4_1_PricesDiscountSpec extends FlatSpec {

  "PricesDiscount" should "return exact result" in {
    val discounted = T4_1_PricesDiscount.discount(Map("T-Short" -> 20d, "Skirt" -> 46d, "Hat" -> 33d), 30)
    assert(discounted == Map("T-Short" -> 14d, "Skirt" -> 32.2, "Hat" -> 23.1))
  }
}
