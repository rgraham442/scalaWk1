package intermediate.garage

import scala.collection.mutable.ArrayBuffer

class Garage {

  object lot {
    val vehicles = ArrayBuffer[Vehicle]()
    val employees = ArrayBuffer[Employee]()
    val customer = ArrayBuffer[Customer]()
  }

  def addCar(id:Int, make:String, colour:String, price:Int): Unit = {
    if (findVehicle(id) == null) {
      lot.vehicles += new Car(make, colour, id, price)
      lot.vehicles.mkString(", ")
    }
  }
  def addBike(id:Int, make:String, colour:String, cost:Int): Unit = {
    if (findVehicle(id) == null) {
      lot.vehicles += new Bike(make, colour, id, cost)
      lot.vehicles.mkString(", ")
    }
  }

  def removeVehicle(id:Int): Unit = {
    if (findVehicle(id) != null) {
      lot.vehicles -= findVehicle(id)
      lot.vehicles.mkString(", ")
    }
  }

  def findVehicle(id:Int):Vehicle = {
    var foundVehicle:Vehicle = null
    lot.vehicles.foreach(vehicle =>
    if (id == vehicle.id) foundVehicle = vehicle
    )
    foundVehicle
  }

  def registerEmployee(name:String, age:Int, id:Int):Unit = {
    if (findEmployee(id) != null) {
      lot.employees += new Employee(name, age, id)
      lot.employees.mkString(", ")
    }
  }

  def findEmployee(id:Int):Employee = {
    var foundEmployee: Employee = null
    lot.employees.foreach(employee =>
      if (id == employee.id) foundEmployee = employee
    )
    foundEmployee
  }

  def fixVehicle(id:Int):Unit = {
      if (findVehicle(id).broken) {
        !lot.vehicles(id).broken
        println("The vehicle has been fixed")
      }
      else {
        println("The vehicle is already fixed")
      }
  }
}



