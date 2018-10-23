package t5

import util.RandomTools

object T5_1_MaxValueCounter {


  def apply(currentValue: Int): T5_1_MaxValueCounter = new T5_1_MaxValueCounter(currentValue)

  def apply(): T5_1_MaxValueCounter = new T5_1_MaxValueCounter
}

class T5_1_MaxValueCounter(var currentValue: Int = 0) extends RandomTools{


  def increment(): Unit = {
    if (currentValue < Int.MaxValue) currentValue += 1
  }

  def current: Int = currentValue

  def perform: Unit = {
    val any = r.nextInt()
    currentValue = any
    increment()
    println(s"Try to increment counter with any value(${any}): and have then: $currentValue.")
    currentValue = Int.MaxValue
    increment()
    println(s"Try to increment counter with max value(${Int.MaxValue}): and have then: $currentValue.")
  }
}
