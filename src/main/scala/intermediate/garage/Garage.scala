package intermediate.garage

import scala.collection.mutable.HashMap

class Garage {
  var open:Boolean = false

  def opener():Unit = {
    open = true
  }
  def closer():Unit = {
    open = false
  }

  object lot {
    val cars = HashMap[Int,Car]
    val bikes = HashMap[Int,Bike]

  }

  def addCar(id:Int,make:String,colour:String): Unit = {

  }
}


