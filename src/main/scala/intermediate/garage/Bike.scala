package intermediate.garage

class Bike (val bikeModel:String, val colourChoice:String, val bikeID:Int) extends Vehicle{
  def model:String = bikeModel
  def tyres:Int = 4
  def colour:String = colourChoice
  def id:Int = bikeID

  override def toString():String = {s"$colour $model bike"}

}
