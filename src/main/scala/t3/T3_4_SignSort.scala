package t3

import t3.T3_4_SignSort._

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object T3_4_SignSort {

  def sort(arr: Array[Int]): Array[Int] = {
    val posIndexes = new ArrayBuffer[Int](arr.length)
    val negIndexes = new ArrayBuffer[Int](arr.length)
    val zeroIndexes = new ArrayBuffer[Int]
    for (i <- 0 until arr.length) {
      if (arr(i) > 0) posIndexes += i
      else if (arr(i) < 0) negIndexes += i
      else zeroIndexes += i
    }
    posIndexes ++= negIndexes ++= zeroIndexes
    val res = new ArrayBuffer[Int](arr.length)
    for (i <- posIndexes) {
      res += arr(i)
    }
    res.toArray
  }

  def apply(): T3_4_SignSort = new T3_4_SignSort
}

class T3_4_SignSort {

  val r = new Random(System.currentTimeMillis)

  def perform: Unit = {
    val arr = (for (_ <- 0 until 20) yield (r.nextInt(100) - 50)).toArray
    val res = sort(arr)
    println(s"Random array(${arr.mkString(", ")}) signSorted: ${res.mkString(", ")}")
  }
}
