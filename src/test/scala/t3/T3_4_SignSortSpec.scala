package t3

import org.scalatest.FlatSpec

class T3_4_SignSortSpec extends FlatSpec {

  "Sign sort" should "return positive numbers, then negative numbers and at the end all zores" in {

    val src = Array(-4, 9, 32, 783, 0, 9, -42, -4, 8, 0, 0, 17, -2)
    val exp = Array(9, 32, 783, 9, 8, 17, -4, -42, -4, -2, 0, 0, 0)
    val res = T3_4_SignSort.sort(src);
    assert(res.deep == exp.deep)
  }
}
