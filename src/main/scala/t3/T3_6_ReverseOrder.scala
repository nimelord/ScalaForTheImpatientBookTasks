package t3

import t3.T3_6_ReverseOrder._
import util.ArrayTools

import scala.collection.mutable

object T3_6_ReverseOrder {

  def reverse(arr: Array[Int]): Array[Int] = {
    arr.reverse
  }

  def reverse(buff: mutable.Buffer[Int]) = {
    buff.reverse
  }

  def apply(): T3_6_ReverseOrder = new T3_6_ReverseOrder
}

class T3_6_ReverseOrder extends ArrayTools {

  def perform: Unit = {
    val arr = mkArray(6)
    println(s"The array(${arr.mkString(", ")}) reversed as array(${reverse(arr).mkString(", ")})")

    val buff = mkBuff(5)
    println(s"The buffer(${buff.mkString(", ")}) reversed as buffer(${reverse(buff).mkString(", ")})")
  }
}
