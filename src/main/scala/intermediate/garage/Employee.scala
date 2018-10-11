package intermediate.garage

class Employee (eName:String, eAge:Int, eID:Int) extends Person {
  def name: String = eName
  def job: String = "Mechanic"
  def age:Int = eAge
  def id:Int = eID

  override def toString: String = {
    s"$name is a $job"
  }
}