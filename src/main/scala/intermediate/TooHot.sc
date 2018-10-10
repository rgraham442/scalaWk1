case class Temperature(degrees:Int,isSummer:Boolean)
def heat(temp:Any):Boolean = temp match {
  case Temperature (degrees, true) if degrees >= 60 & degrees <= 100 => true
  case Temperature (degrees, false) if degrees >= 60 & degrees <= 90 => true
  case _ => false
}

heat(Temperature(94,true))
heat(Temperature(110,true))
heat(Temperature(10,true))
heat(Temperature(70, false))
heat(Temperature(96, false))
heat(Temperature(20, false))
