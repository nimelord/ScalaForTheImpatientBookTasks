package t5

import org.scalatest.FlatSpec

class T5_3_4_TimeSpec extends FlatSpec {

  "Time" should "define it before other Time" in {
    val t = new T5_3_4_Time(14, 23)
    assert(t.before(new T5_3_4_Time(18, 10)))
    assert(t.before(new T5_3_4_Time(14, 24)))
    assert(!t.before(t))
    assert(!t.before(new T5_3_4_Time(10, 59)))
    assert(!t.before(new T5_3_4_Time(14, 17)))
  }

  it should "reject incorrect income parameters" in {
    validateArgument(-1, 0, "The param hours must be between (0, 24]!")
    validateArgument(24, 0, "The param hours must be between (0, 24]!")
    validateArgument(69, 0, "The param hours must be between (0, 24]!")
    validateArgument(0, -1, "The param minutes must be between (0, 60]!")
    validateArgument(0, 60, "The param minutes must be between (0, 60]!")
    validateArgument(0, 83, "The param minutes must be between (0, 60]!")
  }

  def validateArgument(hours: Int, minutes: Int, msg: String): Unit = {
    val e = intercept[IllegalArgumentException] {
      new T5_3_4_Time(hours, minutes)
    }
    assert(e.getMessage == msg, s"Expected \n'$msg',\nbut was \n'${e.getMessage}'.")
  }
}
