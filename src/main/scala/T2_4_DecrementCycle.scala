object T2_4_DecrementCycle {

  def apply() : T2_4_DecrementCycle = new T2_4_DecrementCycle
}

class T2_4_DecrementCycle {

  def perform: Unit = {

    for (i <- 0 to 10; value = 10 -i) {
      print (f"${value} ")
    }

  }
}
