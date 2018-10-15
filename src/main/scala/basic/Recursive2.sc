def recursiveFuncRec(o:String, n:Int):Unit = {
  if (n >= 0) {
    println(o)
    recursiveFuncRec(o, n - 1)
  }
}

def iterateRec(output:String, times:Int):Unit = {
  recursiveFuncRec((output * times), times)
}

iterateRec("Hi",4)


def recursiveFuncSqu(o:String,n:Int):Unit = {
  if (n > 0) {
    println(o)
    recursiveFuncSqu(o, n - 1)
  }
}

def iterateSqu(output:String, times:Int):Unit = {
  recursiveFuncSqu(output + " " * times, times)
}

iterateSqu("Hi",4)
