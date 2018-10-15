package util

import scala.collection.mutable.Buffer
import scala.util.Random

trait RandomTools {

  val r = new Random(System.currentTimeMillis)

  def mkArray(size: Int, rangeTo: Int = 10, rangeFrom: Int = 0): Array[Int] = {
    (0 until size).map(_ => r.nextInt(rangeTo) - rangeFrom).toArray
  }

  def mkBuff(size: Int, rangeTo: Int = 10, rangeFrom: Int = 0): Buffer[Int] = {
    mkArray(size, rangeTo, rangeFrom).toBuffer
  }
}
