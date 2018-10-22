package t4

import t4.T4_7_PropertyTable._

import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.Map

object T4_7_PropertyTable {

  private[this] val TAB_SIZE = 2

  def buildRow(element: (String, Any), size: Int): String = {
    val diff = size + TAB_SIZE - element._1.length
    element._1 + " " * diff + "|" + element._2.toString
  }


  def props: Map[String, Any] = {
    System.getProperties
  }

  def longestPropertySize(props: Map[String, Any]): Int = {
    props.keys.maxBy(_.length).length
  }

  def apply(): T4_7_PropertyTable = new T4_7_PropertyTable
}

class T4_7_PropertyTable {

  def perform: Unit = {

    val props = T4_7_PropertyTable.props
    val length = longestPropertySize(props);
    for (el <- props) {
      println(buildRow(el, length))
    }
  }
}
