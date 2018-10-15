package intermediate.garage

class Customer (val cName:String, val cAge:Int, val money:Int, val cID:Int) extends Person {
  val name: String = cName
  val job: String = "Customer"
  val age:Int = cAge
  val id:Int = cID

  override def toString: String = {
    s"$name is a $age year old $job with £$money"
  }
}
