package t5

import org.scalatest.FlatSpec

class T5_1_6_MaxValueCounterSpec extends FlatSpec {

  "MaxValueCounter" should "stop incrementing if max value" in {
    val c = new T5_1_6_MaxValueCounter(Int.MaxValue)
    c.increment()
    assert(c.current == Int.MaxValue)
  }

  /*
   * I think this conversion is not good solution.
   * If income parameter is out of range, then code must throw exception this is requirement from API Design's point of view.
   *
   * Sorry if my english looks ridiculous.
   */
  it should "convert negative income constructor parameter to 0" in {
    val c = new T5_1_6_MaxValueCounter(-10)
    assert(c.current == 0)
  }
}
