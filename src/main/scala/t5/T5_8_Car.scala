package t5

object T5_8_Car {

  def perform: Unit = {
    val car0 = new T5_8_Car("Opel", "Zafira", 1999, "GPL")
    println(s"The Car0: $car0.")
    val car1 = new T5_8_Car("Opel", "Zafira", 1999)
    println(s"The Car1: $car1.")
    val car2 = new T5_8_Car("Opel", "Zafira", "GPLv3")
    println(s"The Car2: $car2.")
    val car3 = new T5_8_Car("Opel", "Zafira")
    println(s"The Car3: $car3.")
  }
}

class T5_8_Car(val manufacturer: String, val model: String, val year: Int, val license: String) {

  def this(manufacturer: String, model: String, year: Int) {
    this(manufacturer, model, year, "")
  }

  def this(manufacturer: String, model: String, license: String) {
    this(manufacturer, model, -1, license)
  }

  def this(manufacturer: String, model: String) {
    this(manufacturer, model, -1, "")
  }

  override def toString: String = {
    s"Car($manufacturer, $model, $year, $license)"
  }
}
