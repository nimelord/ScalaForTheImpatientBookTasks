package t3

import org.scalatest.FlatSpec

class T3_1_RangeByCycleSpec extends FlatSpec {

  "Range by cycle" should "return from 0 to n numbers" in {
    assert(T3_1_RangeByCycle.range(0, 2).deep == Array(0, 1).deep)
    assert(T3_1_RangeByCycle.range(0, 7).deep == Array(0, 1, 2, 3, 4, 5, 6).deep)
  }
}
