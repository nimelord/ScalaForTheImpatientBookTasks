package t3

import java.util.TimeZone

import t3.T3_10_AmericaTimeZones._
import util.SeqTools

object T3_10_AmericaTimeZones {

  val PREFIX = "America/"

  def getZoneNames: Seq[String] = {
    for (z <- TimeZone.getAvailableIDs.toSeq if z.startsWith(PREFIX)) yield z.substring(PREFIX.length)
  }

  def apply(): T3_10_AmericaTimeZones = new T3_10_AmericaTimeZones
}

class T3_10_AmericaTimeZones extends SeqTools {

  def perform: Unit = {
    println(s"All zone names with 'America' prefix: ${toStr(getZoneNames)}.")
  }
}

