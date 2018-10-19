package t4

import org.scalatest.FlatSpec

class T4_2_3_StatisticsOfWordsFromFileSpec extends FlatSpec {

  "Statistics" should "return exact result" in {
    val exp = Map("Scala" -> 3, "Java" -> 2, "Haskel" -> 4)
    assert(T4_2_3_StatisticsOfWordsFromFile.statisticsFrom("words.txt") == exp)
    assert(T4_2_3_StatisticsOfWordsFromFile.immutableStatisticsFrom("words.txt") == exp)
  }
}
