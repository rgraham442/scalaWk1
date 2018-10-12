package intermediate.garage

class Employee (val eName:String, val eAge:Int, val eID:Int) extends Person {
  def name: String = eName
  def job: String = "Mechanic"
  def age:Int = eAge
  def id:Int = eID

  override def toString: String = {
    s"$name is a $job"
  }
}