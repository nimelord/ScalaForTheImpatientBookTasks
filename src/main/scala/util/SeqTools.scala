package util

import scala.collection.GenTraversableOnce
import scala.collection.mutable.Buffer

trait SeqTools extends RandomTools {

  def mkArray(size: Int, rangeTo: Int = 10, rangeFrom: Int = 0): Array[Int] = {
    (0 until size).map(_ => r.nextInt(rangeTo - rangeFrom) + rangeFrom).toArray
  }

  def mkBuff(size: Int, rangeTo: Int = 10, rangeFrom: Int = 0): Buffer[Int] = {
    mkArray(size, rangeTo, rangeFrom).toBuffer
  }

  def toStr[T <: Any](arr: GenTraversableOnce[T]): String = {
    arr.mkString(", ")
  }
}
