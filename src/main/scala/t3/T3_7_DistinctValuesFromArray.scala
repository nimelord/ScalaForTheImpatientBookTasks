package t3

import t3.T3_7_DistinctValuesFromArray._
import util.SeqTools

object T3_7_DistinctValuesFromArray {

  def distinct(arr: Array[Int]): Array[Int] = {
    arr.distinct
  }

  def apply(): T3_7_DistinctValuesFromArray = new T3_7_DistinctValuesFromArray
}

class T3_7_DistinctValuesFromArray extends SeqTools {

  def prform: Unit = {
    val src = mkArray(15, 4)
    val res = distinct(src);
    println(s"The Array(${toStr(src)}) produce distinct values: ${toStr(res)}")
  }
}
