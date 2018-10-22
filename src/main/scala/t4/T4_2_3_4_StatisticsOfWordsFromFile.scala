package t4

import util.FileTools
import java.util

import scala.collection.JavaConverters._
import scala.collection.SortedMap
import scala.collection.mutable.Map

object T4_2_3_4_StatisticsOfWordsFromFile extends FileTools {


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

  def sortedStatisticsFrom(fileName: String): SortedMap[String, Int] = {
    val map = new util.TreeMap[String, Int]();
    val file = loadFile(fileName)
    for (f <- file.split("\n")) yield {
      val count = map.get(f)
      map.put(f, if (count != 0) count + 1 else 1)
    }
    scala.collection.immutable.SortedMap[String, Int]() ++ map.asScala
  }

  def apply(): T4_2_3_4_StatisticsOfWordsFromFile = new T4_2_3_4_StatisticsOfWordsFromFile
}

class T4_2_3_4_StatisticsOfWordsFromFile {

  import t4.T4_2_3_4_StatisticsOfWordsFromFile._

  def perform: Unit = {
    val file = "words.txt"
    val stats = statisticsFrom(file)
    println(s"Word statistics in file($file) is $stats.")
    val immutableStats = immutableStatisticsFrom(file)
    println(s"Word statistics in file($file) is immutable: $immutableStats.")
    val sortedStats = sortedStatisticsFrom(file)
    println(s"Word statistics in file($file) is sorted: $sortedStats.")
  }
}
