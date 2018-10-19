package t3

import t3.T3_1_RangeByCycle._

import scala.collection.immutable._
import scala.util.Random

object T3_1_RangeByCycle {

  def range(from: Int, toExcluding: Int) = {
    (for (i <- from until toExcluding) yield i).asInstanceOf[Vector[Int]].toArray[Int]
  }

  def apply() = new T3_1_RangeByCycle()
}

class T3_1_RangeByCycle {

  val r = new Random(System.currentTimeMillis)

  def perform {
    val from = 0
    val to = r.nextInt(10)
    val res = range(from, to)
    println(s"Range from $from to $to(excludes): ${res.mkString(", ")}")
  }
}
