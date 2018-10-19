package t4

import util.FileTools

import scala.collection.mutable.Map

object T4_2_StatisticsOfWordsFromFile extends FileTools {


  def statisticsFrom(fileName: String): Map[String, Int] = {
    val file = loadFile(fileName)
    val result = Map[String, Int]()
    for (f <- file.split("\n")) yield {
      val counter = result.getOrElse(f, 0)
      result(f) = counter + 1
    }
    result
  }

  def apply(): T4_2_StatisticsOfWordsFromFile = new T4_2_StatisticsOfWordsFromFile
}

class T4_2_StatisticsOfWordsFromFile {

  import t4.T4_2_StatisticsOfWordsFromFile._

  def perform: Unit = {
    val file = "words.txt"
    val stats = statisticsFrom(file)
    println(s"Word statistics in file($file) is $stats.")
  }
}
