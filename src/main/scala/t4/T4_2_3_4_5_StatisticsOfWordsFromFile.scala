package t4

import util.FileTools
import java.util

import scala.collection.JavaConversions._
import scala.collection.{SortedMap, mutable}

object T4_2_3_4_5_StatisticsOfWordsFromFile extends FileTools {


  def statisticsFrom(fileName: String): mutable.Map[String, Int] = {
    val file = loadFile(fileName)
    val result = mutable.Map[String, Int]()
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
    scala.collection.immutable.SortedMap[String, Int]() ++ immutableStatisticsFrom(fileName)
  }

  def treeMapStatisticsFrom(fileName: String): mutable.Map[String, Int] = {
    val map: mutable.Map[String, Int] = new util.TreeMap[String, Int]
    val file = loadFile(fileName)
    for (f <- file.split("\n")) yield {
      map.put(f, map.getOrElse(f, 0) + 1)
    }
    map
  }

  def apply(): T4_2_3_4_5_StatisticsOfWordsFromFile = new T4_2_3_4_5_StatisticsOfWordsFromFile
}

class T4_2_3_4_5_StatisticsOfWordsFromFile {

  import t4.T4_2_3_4_5_StatisticsOfWordsFromFile._

  def perform: Unit = {
    val file = "words.txt"
    val stats = statisticsFrom(file)
    println(s"Word statistics in file($file) is $stats.")
    val immutableStats = immutableStatisticsFrom(file)
    println(s"Word statistics in file($file) is immutable: $immutableStats.")
    val sortedStats = sortedStatisticsFrom(file)
    println(s"Word statistics in file($file) is sorted: $sortedStats.")
    val treeStats = treeMapStatisticsFrom(file)
    println(s"Word statistics in file($file) is treeMap: $treeStats.")
  }
}
