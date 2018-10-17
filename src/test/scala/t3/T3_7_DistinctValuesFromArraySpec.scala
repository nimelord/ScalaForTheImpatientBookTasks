package t3

import org.scalatest.FlatSpec

class T3_7_DistinctValuesFromArraySpec extends FlatSpec {

  "Distinct values" should "be exact values" in {
    val src = Array(0, 0, 1, 2, 3, 3, 3, 4, 5, 5)
    val res = T3_7_DistinctValuesFromArray.distinct(src)
    assert(res.deep == Array(0, 1, 2, 3, 4, 5).deep)
  }
}
