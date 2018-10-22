package t4

import org.scalatest.FlatSpec

class T4_2_3_4_StatisticsOfWordsFromFileSpec extends FlatSpec {


  "Statistics" should "return exact result" in {
    val exp = Map("Scala" -> 3, "Java" -> 2, "Haskel" -> 4)
    assert(T4_2_3_4_StatisticsOfWordsFromFile.statisticsFrom("words.txt") == exp)
    assert(T4_2_3_4_StatisticsOfWordsFromFile.immutableStatisticsFrom("words.txt") == exp)

    val sorted = T4_2_3_4_StatisticsOfWordsFromFile.sortedStatisticsFrom("words.txt")
    val it = sorted.iterator
    validate(it.next(), "Haskel", 4)
    validate(it.next(), "Java", 2)
    validate(it.next(), "Scala", 3)
  }

  def validate(a: (String, Int), key: String, value: Int): Unit = {
    assert(a._1 == key, s"Incorrect tuple(${a._1} -> ${a._2}), but expected($key -> $value)")
  }
}
