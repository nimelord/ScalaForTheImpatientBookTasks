import T2_4_DecrementCycle._

object T2_4_DecrementCycle {

  def cycleValues: Array[Int] = {
	  val seq = for (i <- 0 to 10; value = 10 - i) yield value
    seq.toArray
  }

  def apply() : T2_4_DecrementCycle = new T2_4_DecrementCycle
}

class T2_4_DecrementCycle {

  def perform: Unit = {

    for (i <- cycleValues) {
	    print(s"$i ")
    }
	  print("\n")
  }
}
