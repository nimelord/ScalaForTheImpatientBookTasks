package t5

import util.RandomTools

object T5_1_6_MaxValueCounter extends RandomTools {

  def perform: Unit = {
    val counter = new T5_1_6_MaxValueCounter
    val any = r.nextInt()
    counter.currentValue = any
    counter.increment()
    println(s"Try to increment counter with any value(${any}): and have then: ${counter.currentValue}.")
    counter.currentValue = Int.MaxValue
    counter.increment()
    println(s"Try to increment counter with max value(${Int.MaxValue}): and have then: ${counter.currentValue}.")

    val negativeValue = -9237
    val counter2 = new T5_1_6_MaxValueCounter(negativeValue)
    println(s"The counter constructed with negative init parameter($negativeValue): and have then: ${counter2.currentValue}.")
  }
}

class T5_1_6_MaxValueCounter(var currentValue: Int = 0) extends RandomTools {

  currentValue = if (currentValue < 0) 0 else currentValue

  def increment(): Unit = {
    if (currentValue < Int.MaxValue) currentValue += 1
  }

  def current: Int = currentValue
}
