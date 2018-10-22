package t4

import org.scalatest.FlatSpec
import util.TupleValidator

class T4_8_9_TupleStatResultSpec extends FlatSpec with TupleValidator {

  "TupleStatResult" should "return min-max result" in {
    val arr = Array(-2, 5, 7, 3, -4, 19, 55, -10)
    val t = T4_8_9_TupleStatResult.minmax(arr)
    validate(t, -10, 55)
  }

  it should "return lessThan counter, equal counter and greaterThan counter" in {
    val arr = Array(-4, 3, -7, -10, 3, 18, 19, 3, -10)
    val t = T4_8_9_TupleStatResult.lteqgt(arr, 3)
    validate(t, 4, 3, 2)
  }
}
