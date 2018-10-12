package intermediate.garage

class Car (val carModel:String, val colourChoice:String, val carID:Int) extends Vehicle{
  def model:String = carModel
  def tyres:Int = 4
  def colour:String = colourChoice
  def id:Int = carID

  override def toString():String = {s"$colour $model car"}
}
