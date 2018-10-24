package t5

import org.scalatest.FlatSpec

class T5_8_CarSpec extends FlatSpec {

  "Car constructed with all params" should "contain all values correctly" in {
    val car = new T5_8_Car("Opel", "Zafira", 1999, "GPL")
    validate(car, "Opel", "Zafira", 1999, "GPL")
  }

  "Car constructed without license" should "contain empty license parameter" in {
    val car = new T5_8_Car("Opel", "Zafira", 1999)
    validate(car, "Opel", "Zafira", 1999, "")
  }

  "Car constructed without year" should "contain -1 in year property" in {
    val car = new T5_8_Car("Opel", "Zafira", "GPLv3")
    validate(car, "Opel", "Zafira", -1, "GPLv3")
  }

  "Car constructed without year and license" should "contain -1 in year property and empty license" in {
    val car = new T5_8_Car("Opel", "Zafira")
    validate(car, "Opel", "Zafira", -1, "")
  }

  def validate(car: T5_8_Car, manufacturer: String, model: String, year: Int, license: String): Unit = {
    assert(car.manufacturer == manufacturer)
    assert(car.model == model)
    assert(car.year == year)
    assert(car.license == license)
  }
}
