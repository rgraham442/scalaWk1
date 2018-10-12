package intermediate.garage

import scala.collection.mutable.HashMap

class Garage {
  var open: Boolean = false

  def opener(): Unit = {
    open = true
  }

  def closer(): Unit = {
    open = false
  }

  object lot {
    val cars = HashMap[Int, Car]()
    val bikes = HashMap[Int, Bike]()

  }

  def addCar(id:Int, make:String, colour:String): Unit = {
    if (lot.cars.get(id).isEmpty) {
      lot.cars += (id -> new Car(make, colour, id))
      lot.cars.mkString(", ")
    }
  }

  def removeCar(id:Int): Unit = {
    if (lot.cars.get(id).nonEmpty) {
      lot.cars -= id
      lot.cars.mkString(", ")
    }
  }

  def addBike(id:Int, make:String, colour:String): Unit = {
    if (lot.bikes.get(id).isEmpty) {
      lot.bikes += (id -> new Bike(make, colour, id))
      lot.bikes.mkString(", ")
    }
  }
  def removeBike(id:Int): Unit = {
    if (lot.bikes.get(id).nonEmpty) {
      lot.bikes -= id
      lot.bikes.mkString(", ")
    }
  }

  def addEmployee
}



