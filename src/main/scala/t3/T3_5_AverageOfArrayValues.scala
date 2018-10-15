package t3

import t3.T3_5_AverageOfArrayValues._

import scala.util.Random

object T3_5_AverageOfArrayValues {

  def average(arr: Array[Double]): Double = {
    var summ = 0.0;
    arr.foreach(v => summ += v)
    summ / arr.length
  }

  def apply(): T3_5_AverageOfArrayValues = new T3_5_AverageOfArrayValues
}

class T3_5_AverageOfArrayValues {

  val r = new Random(System.currentTimeMillis)

  def perform {
    val arr = (0 until 6).map(i => r.nextDouble).toArray
    val res = average(arr)
    println(s"For arrayOfDoubles(${arr.mkString(", ")}) have average result: $res")
  }
}
