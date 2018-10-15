package intermediate.garage

import scala.collection.mutable.HashMap

class Garage {
  var open: Boolean = false

  def opener(): Unit = {
    open == true
  }

  def closer(): Unit = {
    open == false
  }

  def closeCheck():Unit = {
    if (!open) {
      println("Sorry, the garage is closed right now")
      System.exit(1)
    }
  }

  closeCheck()

  object lot {
    val cars = HashMap[Int, Car]()
    val bikes = HashMap[Int, Bike]()
    val employees = HashMap[Int, Employee]()

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

  def registerEmployee(name:String, age:Int, id:Int):Unit = {
    if (lot.employees.get(id).isEmpty) {
      lot.employees += (id -> new Employee(name, age, id))
      lot.employees.mkString(", ")
    }
  }

  def fixVehicle(choice:String, id:Int):Unit = {
    if (choice == "cars") {
      if (lot.cars(id).broken) {
        lot.cars(id).broken == false
        println("The vehicle has been fixed")
      }
      else {
        println("The vehicle is already fixed")
      }
    }
    else if (choice == "bikes") {
      if (lot.bikes(id).broken) {
        lot.bikes(id).broken == false
        println("The vehicle has been fixed")
      }
      else {
        println("The vehicle is already fixed")
      }
    }
    else {
      println("Invalid entry")
    }
  }

}



