package intermediate.garage

abstract class Vehicle {
  val model:String
  val tyres:Int
  val colour:String
  val id:Int
  val broken:Boolean

  override def toString: String = super.toString

}


