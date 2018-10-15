package intermediate.garage

class Employee (val eName:String, val eAge:Int, val eID:Int) extends Person {
  val name: String = eName
  val job: String = "Mechanic"
  val age:Int = eAge
  val id:Int = eID

  override def toString: String = {
    s"$name is a $job"
  }
}