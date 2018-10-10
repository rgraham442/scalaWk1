var output = ""

def recursiveFuncRec(n:Int):Unit = {
  if (n >= 0) {
    println(output)
    recursiveFuncRec(n - 1)
  }
}

def iterateRec(output2:String, times:Int):Unit = {
  output = output2 * times
  recursiveFuncRec(times)
}

iterateRec("Hi",4)


def recursiveFuncSqu(n:Int):Unit = {
  if (n > 0) {
    println(output)
    recursiveFuncSqu(n - 1)
  }
}

def iterateSqu(output2:String, times:Int):Unit = {
  output = (output2 + " ") * times
  recursiveFuncSqu(times)
}

iterateSqu("Hi",4)
