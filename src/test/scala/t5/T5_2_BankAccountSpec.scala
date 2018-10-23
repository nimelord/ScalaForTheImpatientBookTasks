package t5

import org.scalatest.FlatSpec

class T5_2_BankAccountSpec extends FlatSpec{

  "Bank account" should "be correct with deposits and withdraws" in {

    val acc = new T5_2_BankAccount
    assert(acc.balance == 0)
    acc.deposit(34.50)
    assert(acc.balance == 34.50)
    acc.deposit(5.50)
    assert(acc.balance == 40.0)
    acc.withdraw(18.0)
    assert(acc.balance == 22.0)

    assertThrows[NotEnoughMoney] {
      acc.withdraw(23.0)
    }
  }
}
