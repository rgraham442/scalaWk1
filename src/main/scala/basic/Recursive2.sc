def recursiveFunc(o:String, n:Int):Unit = n match {
  case n if n > 0 => println(o)
    recursiveFunc(o, n - 1)
  case _ =>
}

def iterateRec(output:String, times:Int):Unit = {
  recursiveFunc((output * times) + "\n", times)
}

iterateRec("Hi",4)

def iterateSqu(output:String, times:Int):Unit = {
  recursiveFunc((output + " ") * times, times)
}

iterateSqu("Hi",4)
