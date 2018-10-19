package t4

import util.FileTools

import scala.collection.mutable.Map

object T4_2_3_StatisticsOfWordsFromFile extends FileTools {


  def statisticsFrom(fileName: String): Map[String, Int] = {
    val file = loadFile(fileName)
    val result = Map[String, Int]()
    for (f <- file.split("\n")) yield {
      val counter = result.getOrElse(f, 0)
      result(f) = counter + 1
    }
    result
  }

  def immutableStatisticsFrom(fileName: String): scala.collection.immutable.Map[String, Int] = {
    val file = loadFile(fileName)
    var result = scala.collection.immutable.Map[String, Int]().withDefaultValue(0)
    for (f <- file.split("\n")) yield {
      result = result + (f -> (result(f) + 1))
    }
    result
  }

  def apply(): T4_2_3_StatisticsOfWordsFromFile = new T4_2_3_StatisticsOfWordsFromFile
}

class T4_2_3_StatisticsOfWordsFromFile {

  import t4.T4_2_3_StatisticsOfWordsFromFile._

  def perform: Unit = {
    val file = "words.txt"
    val stats = statisticsFrom(file)
    println(s"Word statistics in file($file) is $stats.")
    val immutableStats = immutableStatisticsFrom(file)
    println(s"Word statistics in file($file) is $immutableStats.")
  }
}
