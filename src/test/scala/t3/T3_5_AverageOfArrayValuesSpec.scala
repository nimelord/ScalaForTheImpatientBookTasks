package t3

import org.scalatest.FlatSpec

class T3_5_AverageOfArrayValuesSpec extends FlatSpec {

  "Average of values" should "calculated correctly" in {
    val values = Array(3.0, 2.5, 5.5, 10.0, 2.25, 3.75)
    val res = T3_5_AverageOfArrayValues.average(values)
    assert(res == 4.5)
  }
}
