package t3

import t3.T3_8_RemoveNegativeValuesExceptFirst._
import util.SeqTools

import scala.collection.mutable.Buffer

object T3_8_RemoveNegativeValuesExceptFirst {

  def removeNegatives(buff: Buffer[Int]): Unit = {
    val indexes = (for (i <- 0 until buff.length if buff(i) < 0) yield i).reverse.toBuffer
    if (indexes.length > 1) {
      indexes.remove(indexes.length - 1)
    }
    for (i <- indexes) buff.remove(i)
  }

  def apply(): T3_8_RemoveNegativeValuesExceptFirst = new T3_8_RemoveNegativeValuesExceptFirst
}

class T3_8_RemoveNegativeValuesExceptFirst extends SeqTools {

  def perform: Unit = {
    val buff = mkBuff(20, 6, -5)
    val src = toStr(buff)
    removeNegatives(buff)
    println(s"The buff($src) was processed to buff(${toStr(buff)})")
  }
}
