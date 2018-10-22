package t4

import org.scalatest.FlatSpec

class T4_7_PropertyTableSpec extends FlatSpec {

  "PropertyTable" should "define longest property size" in {
    val props = Map[String, Any]("First" -> 10, "Second" -> "AnyValue", "TheLongestKeyOfTheMap" -> "yep")
    val size = T4_7_PropertyTable.longestPropertySize(props)
    assert(size == 21)
  }

  it should "build correct row with any length" in {
    val props = Map[String, Any]("First" -> 10, "Second" -> "AnyValue", "TheLongestKeyOfTheMap" -> "yep")
    val size = T4_7_PropertyTable.longestPropertySize(props)
    val it = props.iterator;
    assert(T4_7_PropertyTable.buildRow(it.next, size) == "First                  |10")
    assert(T4_7_PropertyTable.buildRow(it.next, size) == "Second                 |AnyValue")
    assert(T4_7_PropertyTable.buildRow(it.next, size) == "TheLongestKeyOfTheMap  |yep")
  }
}
