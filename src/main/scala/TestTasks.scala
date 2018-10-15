import t2._
import t3.{T3_1_RangeByCycle, T3_2_3_ElementPairReplacer, T3_4_SignSort}

object TestTasks {

  def main(args: Array[String]) {

    println("Welcome to the Scala world!")
    runChapter2Tasks
    runChapter3Tasks
  }

  def runChapter2Tasks {
    println("\n\nTasks of Chapter #2:")
    T2_1_Sign().perform
    T2_4_DecrementCycle().perform
    T2_6_7_UnicodeMultiplication().perform
    T2_10_ComplicatedRecursion().perform
    T2_11_DateInterpolation().perform
  }

  def runChapter3Tasks {
    println("\n\nTasks of Chapter #3:")
    T3_1_RangeByCycle().perform
    T3_2_3_ElementPairReplacer().perform
    T3_4_SignSort().perform
  }
}
