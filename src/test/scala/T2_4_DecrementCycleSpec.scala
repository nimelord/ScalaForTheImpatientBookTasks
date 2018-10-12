import org.scalatest.FlatSpec

class T2_4_DecrementCycleSpec extends FlatSpec {

  "Decrement Cycle" should "return exact array" in {
	  val expected = Array(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0).deep
	  val actual = T2_4_DecrementCycle.cycleValues.deep
	  assert(expected.equals(actual))
  }
}
