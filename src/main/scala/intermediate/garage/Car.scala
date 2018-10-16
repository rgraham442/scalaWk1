package intermediate.garage

class Car (val carModel:String, val colourChoice:String, val carID:Int, price:Int) extends Vehicle{
  val model:String = carModel
  val tyres:Int = 4
  val colour:String = colourChoice
  val id:Int = carID
  val broken:Boolean = true
  val cost:Int = price
  val repairTime:Int = 10

  override def toString():String = {s"$colour $model car"}

  override def fixVehicle(hoursLeft:Int): Unit = hoursLeft match{
    case `hoursLeft` if hoursLeft >= repairTime => hoursLeft - repairTime
      println(s"$carModel repaired")
    case _ => println("There is not enough time")
  }
}
