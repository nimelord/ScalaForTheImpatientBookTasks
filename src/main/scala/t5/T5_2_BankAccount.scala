package t5

object T5_2_BankAccount {

  def perform: Unit = {

    val acc = new T5_2_BankAccount
    println(s"Create Bank Account: ($acc)")
    val deposit1 = 34.50
    println(s"Add first deposit: $deposit1")
    acc.deposit(deposit1)
    println(s"Result: ($acc)")
    val deposit2 = 5.50
    println(s"Add second deposit: $deposit2")
    acc.deposit(deposit2)
    println(s"Result: ($acc)")
    val withdraw = 18.0
    println(s"Withdraw: $withdraw")
    acc.withdraw(withdraw)
    println(s"Result: ($acc)")
  }
}

class T5_2_BankAccount {

  private var currentBalance = 0d;

  def balance: Double = currentBalance

  def deposit(value: Double): Unit = currentBalance += value

  override def toString(): String = {
    s"Balance($currentBalance)"
  }

  def withdraw(value: Double): Unit = {
    if (value > currentBalance) throw new NotEnoughMoney
    currentBalance -= value
  }
}

class NotEnoughMoney extends Exception
