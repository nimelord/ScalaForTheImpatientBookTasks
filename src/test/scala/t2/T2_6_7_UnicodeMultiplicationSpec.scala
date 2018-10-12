package t2

import org.scalatest.FlatSpec

class T2_6_7_UnicodeMultiplicationSpec extends FlatSpec {

  "Multiplication of unicode codes for 'Hello'" should "return 9415087488 using 'for'" in {
    val res = T2_6_7_UnicodeMultiplication.multiFor("Hello")
    assert(res == 9415087488l, s"unexpected result: $res.")
  }

  it should "" in {
    val res = T2_6_7_UnicodeMultiplication.multiFoldLeft("Hello")
    assert(res == 9415087488l, s"unexpected result: $res.")
  }
}
