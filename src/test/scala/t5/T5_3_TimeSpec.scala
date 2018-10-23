package t5

import org.scalatest.FlatSpec

class T5_3_TimeSpec extends FlatSpec {

  "Time" should "define it before other Time" in {
    val t = new T5_3_Time(14, 23)
    assert(t.before(new T5_3_Time(18, 10)))
    assert(t.before(new T5_3_Time(14, 24)))
    assert(!t.before(t))
    assert(!t.before(new T5_3_Time(10, 59)))
    assert(!t.before(new T5_3_Time(14, 17)))
  }
}
