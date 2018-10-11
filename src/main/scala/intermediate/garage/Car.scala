package intermediate.garage

class Car (carModel:String, colourChoice:String) extends Vehicle{
  def model:String = carModel
  def tyres:Int = 4
  def colour:String = colourChoice

  def this(carModel:String) = this(carModel,"Red")

  override def toString():String = {s"This is a $colour $model car"}
}
