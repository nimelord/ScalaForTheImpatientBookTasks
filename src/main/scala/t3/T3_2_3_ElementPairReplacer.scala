package t3

import t3.T3_2_3_ElementPairReplacer._

object T3_2_3_ElementPairReplacer {

  def replace(arr: Array[Int]) {
    for (i <- 0 until arr.length if (i % 2 == 1)) {
      arr(i) = arr(i) ^ arr(i - 1)
      arr(i - 1) = arr(i) ^ arr(i - 1)
      arr(i) = arr(i) ^ arr(i - 1)
    }
  }

  def replace2(arr: Array[Int]): Array[Int] = {
    (for (i <- 0 until arr.length) yield
      if (i % 2 == 1) arr(i - 1)
      else if (i % 2 == 0 && i < arr.length - 1) arr(i + 1)
      else arr(i)).toArray
  }

  def apply(): T3_2_3_ElementPairReplacer = new T3_2_3_ElementPairReplacer
}

class T3_2_3_ElementPairReplacer {

  def perform: Unit = {
    val src = Array(0, 1, 2, 3, 4, 5, 6)
    val srcArrStr = src.mkString(", ")
    println(s"The array($srcArrStr) with replaced pairs is new array(${replace2(src).mkString(", ")})")
    replace(src)
    println(s"The array($srcArrStr) with replaced pairs is exists array(${src.mkString(", ")})")
  }
}
