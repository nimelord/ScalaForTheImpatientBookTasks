package t6

import org.scalatest.FlatSpec

class T6_1_ConversionsSpec extends FlatSpec {

  "Conversions" should "convert inches to centimeters" in {
    val res = T6_1_Conversions.inchesToCentimeters(10)
    assert(res == 25.4)
  }

  it should "convert gallons to liters" in {
    val res = T6_1_Conversions.gallonsToLiters(100000)
    assert(res == 378541.0)
  }

  it should "convert miles to kilometers" in {
    val res = T6_1_Conversions.milesToKilometers(100000)
    assert(res == 160934.0)
  }
}
