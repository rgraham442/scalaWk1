package intermediate.garage

abstract class Vehicle {
  val model:String
  val tyres:Int
  val colour:String
  val id:Int
  val broken:Boolean
  val cost:Int

  override def toString: String
  def fixVehicle(hoursLeft:Int):Unit

}


