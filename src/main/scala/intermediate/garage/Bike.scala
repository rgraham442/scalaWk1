package intermediate.garage

class Bike (val bikeModel:String, val colourChoice:String, val bikeID:Int) extends Vehicle{
  val model:String = bikeModel
  val tyres:Int = 4
  val colour:String = colourChoice
  val id:Int = bikeID
  val broken:Boolean = true

  override def toString():String = {s"$colour $model bike"}

}
