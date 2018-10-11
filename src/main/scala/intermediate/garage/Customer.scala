package intermediate.garage

class Customer (cName:String, cAge:Int, money:Int, cID:Int) extends Person {
  def name: String = cName
  def job: String = "Customer"
  def age:Int = cAge
  def id:Int = cID

  def this (cName:String, cAge:Int) = this(cName,cAge,500)

  override def toString: String = {
    s"$name is a $age year old $job with £$money"
  }
}
