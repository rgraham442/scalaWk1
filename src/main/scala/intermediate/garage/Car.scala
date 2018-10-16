package intermediate.garage

class Car (val carModel:String, val colourChoice:String, val carID:Int) extends Vehicle{
  val model:String = carModel
  val tyres:Int = 4
  val colour:String = colourChoice
  val id:Int = carID
  val broken:Boolean = true

  override def toString():String = {s"$colour $model car"}
}
