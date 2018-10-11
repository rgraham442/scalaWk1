package intermediate.garage

abstract class Vehicle {
  def model:String
  def tyres:Int
  def colour:String
  def id:Int

  override def toString: String = super.toString

}


