package intermediate.garage

object Main {
  def main(args: Array[String]): Unit = {

    val gar = new Garage()

    gar.addCar(1,"Tesla","Blue", 1700)
    gar.addCar(2,"Skoda","Grey", 400)
    gar.addBike(3,"Biker","Yellow", 200)
    println(gar.lot.vehicles)
    gar.removeVehicle(1)
    println(gar.lot.vehicles)
    gar.fixVehicle(2)
    gar.fixVehicle(2)

  }
}
