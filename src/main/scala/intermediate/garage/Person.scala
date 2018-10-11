package intermediate.garage

abstract class Person {
  def name:String
  def job:String
  def age:Int
  def id:Int

  override def toString: String = super.toString
}
