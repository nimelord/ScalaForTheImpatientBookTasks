package t6

object T6_1_Conversions {


  val INCH_MULTIPLIER = 2.54
  val GALLON_MULTIPLIER = 3.78541
  val MILE_MULTIPLIER = 1.60934


  def inchesToCentimeters(inches: Double): Double = {
    inches * INCH_MULTIPLIER
  }

  def gallonsToLiters(gallons: Double): Double = {
    gallons * GALLON_MULTIPLIER
  }

  def milesToKilometers(miles: Double): Double = {
    miles * MILE_MULTIPLIER
  }

  def perform: Unit = {
    println(s"The one inch contains ${T6_1_Conversions.inchesToCentimeters(1)} centimeters.")
    println(s"The one gallon contains ${T6_1_Conversions.gallonsToLiters(1)} liters.")
    println(s"The one mile contains ${T6_1_Conversions.milesToKilometers(1)} kilometers.")
  }

}
