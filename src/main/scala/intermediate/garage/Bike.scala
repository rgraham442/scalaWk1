package intermediate.garage

class Bike (val bikeModel:String, val colourChoice:String, val bikeID:Int, price:Int) extends Vehicle{
  val model:String = bikeModel
  val tyres:Int = 4
  val colour:String = colourChoice
  val id:Int = bikeID
  val broken:Boolean = true
  val cost:Int = price
  val repairTime:Int = 6

  override def toString():String = {s"$colour $model bike"}

  override def fixVehicle(hoursLeft:Int): Unit = hoursLeft match{
    case `hoursLeft` if hoursLeft >= repairTime => hoursLeft - repairTime
      println(s"$bikeModel repaired")
    case _ => println("There is not enough time")
  }
}
