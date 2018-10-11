package intermediate.garage

class Bike (bikeModel:String, colourChoice:String, bikeID:Int) extends Vehicle{
  def model:String = bikeModel
  def tyres:Int = 4
  def colour:String = colourChoice
  def id:Int = bikeID

  def this(bikeModel:String) = this(bikeModel,"Red")

  override def toString():String = {s"This is a $colour $model bike"}

}
