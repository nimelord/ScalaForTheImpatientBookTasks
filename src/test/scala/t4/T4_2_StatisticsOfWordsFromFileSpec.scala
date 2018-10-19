package t4

import org.scalatest.FlatSpec

class T4_2_StatisticsOfWordsFromFileSpec extends FlatSpec {

  "Statistics" should "return exact result" in {
    val stats = T4_2_StatisticsOfWordsFromFile.statisticsFrom("words.txt")
    assert(stats == Map("Scala" -> 3, "Java" -> 2, "Haskel" -> 4))
  }
}
