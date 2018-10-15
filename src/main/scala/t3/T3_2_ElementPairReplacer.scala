package t3

import t3.T3_2_ElementPairReplacer._

object T3_2_ElementPairReplacer {

  def replace(arr: Array[Int]): Array[Int] = {
    (for (i <- 0 until arr.length) yield
      if (i % 2 == 1) arr(i - 1)
      else if (i % 2 == 0 && i < arr.length - 1) arr(i + 1)
      else arr(i)).toArray
  }

  def apply(): T3_2_ElementPairReplacer = new T3_2_ElementPairReplacer
}

class T3_2_ElementPairReplacer {

  def perform: Unit = {
    val src = Array(0, 1, 2, 3, 4, 5, 6)
    println(s"The array(${src.mkString(", ")}) with replaced pairs is array(${replace(src).mkString(", ")})")
  }
}
