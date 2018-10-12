package intermediate.garage

class Customer (val cName:String, val cAge:Int, val money:Int, val cID:Int) extends Person {
  def name: String = cName
  def job: String = "Customer"
  def age:Int = cAge
  def id:Int = cID

  override def toString: String = {
    s"$name is a $age year old $job with £$money"
  }
}
