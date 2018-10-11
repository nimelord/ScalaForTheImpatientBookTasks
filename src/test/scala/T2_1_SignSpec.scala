import org.scalatest._

class T2_1_SignSpec extends  FlatSpec{

  "Sign function" should "return 1 for zero argument" in {
    assert(T2_1_Sign.sign(0) == 1)
  }

  it should "return 1 for positive argument" in {
    assert(T2_1_Sign.sign(1) == 1)
    assert(T2_1_Sign.sign(10) == 1)
  }

  it should "return -1 for negative argument" in {
    assert(T2_1_Sign.sign(-1) == -1)
    assert(T2_1_Sign.sign(-1024) == -1)
  }

}
