package t4

import util.SeqTools

object T4_8_9_TupleStatResult {

  def lteqgt(arr: Array[Int], value: Int): (Int, Int, Int) = {
    var lt = 0
    var eq = 0
    var gt = 0
    for (i <- arr) {
      if (i < value) lt += 1
      else if (i == value) eq += 1
      else gt += 1
    }
    (lt, eq, gt)
  }


  def minmax(arr: Array[Int]): (Int, Int) = {
    var min = Int.MaxValue
    var max = Int.MinValue
    for (i <- arr) {
      min = if (i < min) i else min
      max = if (i > max) i else max
    }
    (min, max)
  }


  def apply(): T4_8_9_TupleStatResult = new T4_8_9_TupleStatResult
}

class T4_8_9_TupleStatResult extends SeqTools {

  def perform: Unit = {
    val arr0 = Array(-2, 5, 7, 3, -4, 19, 55, -10)
    val t2 = T4_8_9_TupleStatResult.minmax(arr0)
    println(s"For arr(${toStr(arr0)}) minutes-max is ${t2}")

    val arr1 = Array(-4, 3, -7, -10, 3, 18, 19, 3, -10)
    val t3 = T4_8_9_TupleStatResult.lteqgt(arr1, 3)
    println(s"For arr(${toStr(arr1)}) lessThan, Equal and GreaterThan counters is ${t3}")
  }
}
