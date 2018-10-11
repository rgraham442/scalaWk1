package intermediate.garage

class Car (carModel:String, colourChoice:String, carID:Int) extends Vehicle{
  def model:String = carModel
  def tyres:Int = 4
  def colour:String = colourChoice
  def id:Int = carID

  def this(carModel:String) = this(carModel,"Red")

  override def toString():String = {s"This is a $colour $model car"}
}
