package t3

import org.scalatest.FlatSpec

class T3_6_ReverseOrderSpec extends FlatSpec {

  "Reverse order" should "exact result for array" in {
    val arr = Array(0, 1, 2, 3, 4, 5)
    val revArr = T3_6_ReverseOrder.reverse(arr);
    assert(revArr.deep == Array(5, 4, 3, 2, 1, 0).deep)
  }

  it should "exact result for array buffer" in {
    val arr = Array(0, 1, 2, 3, 4, 5).toBuffer
    val revArr = T3_6_ReverseOrder.reverse(arr);
    assert(revArr == Array(5, 4, 3, 2, 1, 0).toBuffer)
  }
}
