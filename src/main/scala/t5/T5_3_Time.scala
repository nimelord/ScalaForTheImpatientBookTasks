package t5

import util.RandomTools

object T5_3_Time extends RandomTools {

  def perform: Unit = {
    val t0 = time()
    val t1 = time()
    println(s"t0 $t0 is before t1 $t1: ${t0.before(t1)}")
  }

  private[this] def time(): T5_3_Time = {
    val hours = r.nextInt(24)
    val minutes = r.nextInt(60)
    new T5_3_Time(hours, minutes)
  }
}

class T5_3_Time(private val hours: Int, private val minutes: Int) {

  def before(time: T5_3_Time): Boolean = {
    if (hours < time.hours) true
    else if (hours == time.hours && minutes < time.minutes) true
    else false
  }

  override def toString: String = {
    s"Time($hours, $minutes)"
  }
}
