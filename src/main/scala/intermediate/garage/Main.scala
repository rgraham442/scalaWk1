package intermediate.garage

object Main {
  def main(args: Array[String]): Unit = {

    val gar = new Garage()

    gar.opener()
    gar.addCar(1,"Tesla","Blue")
    gar.addCar(2,"Skoda","Grey")
    println(gar.lot.cars)
    gar.removeCar(1)
    println(gar.lot.cars)
    gar.fixVehicle("cars",2)

  }
}
