package t4

import t4.T4_1_PricesDiscount._
import util.RandomTools

object T4_1_PricesDiscount {

  def discount(prices: Map[String, Double], discount: Int): Map[String, Double] = {
    for ((k, v) <- prices) yield (k, v - v * discount / 100)
  }

  def apply(): T4_1_PricesDiscount = new T4_1_PricesDiscount
}

class T4_1_PricesDiscount extends RandomTools {

  def perform: Unit = {
    val discountValue = 25
    val items = Array("Shoes", "Scarf", "Jeans", "Pants")
    val prices = (for (i <- items) yield (i, 1d * r.nextInt(100))).toMap
    val discountedPrices = discount(prices, discountValue)
    println(s"The Prices ${prices} with discount $discountValue% is $discountedPrices")
  }
}
