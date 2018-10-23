package t5

import org.scalatest.FlatSpec

class T5_1_MaxValueCounterSpec extends FlatSpec {

  "MaxValueCounter" should "stop incrementing if max value" in {
    val c = T5_1_MaxValueCounter(Int.MaxValue)
    c.increment()
    assert(c.current == Int.MaxValue)
  }
}
