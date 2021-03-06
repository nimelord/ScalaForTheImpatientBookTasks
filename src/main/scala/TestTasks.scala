import t2._
import t3._
import t4._
import t5._
import t6.{T6_1_Conversions, T6_6_7_CardSuit, T6_8_ColorCube}

object TestTasks {

  def main(args: Array[String]) {

    println("Welcome to the Scala world!")
    runChapter2Tasks
    runChapter3Tasks
    runChapter4Tasks
    runChapter5Tasks
    runChapter6Tasks
  }

  def runChapter2Tasks {
    printChapter(2)
    T2_1_Sign().perform
    T2_4_DecrementCycle().perform
    T2_6_7_UnicodeMultiplication().perform
    T2_10_ComplicatedRecursion().perform
    T2_11_DateInterpolation().perform
  }

  def runChapter3Tasks {
    printChapter(3)
    T3_1_RangeByCycle().perform
    T3_2_3_ElementPairReplacer().perform
    T3_4_SignSort().perform
    T3_5_AverageOfArrayValues().perform
    T3_6_ReverseOrder().perform
    T3_7_DistinctValuesFromArray().prform
    T3_8_RemoveNegativeValuesExceptFirst().perform
    T3_10_AmericaTimeZones().perform
    T3_11_FlavorMap().perform
  }

  def runChapter4Tasks {
    printChapter(4)
    T4_1_PricesDiscount().perform
    T4_2_3_4_5_StatisticsOfWordsFromFile().perform
    T4_6_DayCalendar().perform
    T4_7_PropertyTable().perform
    T4_8_9_TupleStatResult().perform
  }

  def runChapter5Tasks: Unit = {
    printChapter(5)
    T5_1_6_MaxValueCounter.perform
    T5_2_BankAccount.perform
    T5_3_4_Time.perform
    T5_5_Student.perform
    T5_7_Person.perform
    T5_8_Car.perform
  }

  def runChapter6Tasks: Unit = {
    printChapter(6)
    T6_1_Conversions.perform
    T6_6_7_CardSuit.perform
    T6_8_ColorCube.perform
  }

  def printChapter(num: Int) {
    println(s"\n\n\n    ***    Tasks of Chapter #$num:    ***\n")
  }
}
