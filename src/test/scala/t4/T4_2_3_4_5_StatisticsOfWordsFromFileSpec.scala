package t4

import org.scalatest.FlatSpec

class T4_2_3_4_5_StatisticsOfWordsFromFileSpec extends FlatSpec {


  "Statistics" should "return exact result: simple" in {
    val exp = Map("Scala" -> 3, "Java" -> 2, "Haskel" -> 4)
    assert(T4_2_3_4_5_StatisticsOfWordsFromFile.statisticsFrom("words.txt") == exp)
  }

  it should "return exact result: immutable" in {
    val exp = Map("Scala" -> 3, "Java" -> 2, "Haskel" -> 4)
    assert(T4_2_3_4_5_StatisticsOfWordsFromFile.immutableStatisticsFrom("words.txt") == exp)
  }

  it should "return exact result: sorted" in {
    val sorted = T4_2_3_4_5_StatisticsOfWordsFromFile.sortedStatisticsFrom("words.txt")
    validateSorted(sorted.iterator)
  }

  it should "return exact result: java.util.TreeMap" in {
    val sorted = T4_2_3_4_5_StatisticsOfWordsFromFile.treeMapStatisticsFrom("words.txt")
    validateSorted(sorted.iterator)
  }

  private def validateSorted(it: Iterator[(String, Int)]) = {
    validate(it.next(), "Haskel", 4)
    validate(it.next(), "Java", 2)
    validate(it.next(), "Scala", 3)
  }

  private def validate(a: (String, Int), key: String, value: Int): Unit = {
    assert(a._1 == key, s"Incorrect tuple(${a._1} -> ${a._2}), but expected($key -> $value)")
  }
}
