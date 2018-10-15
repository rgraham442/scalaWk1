def recursiveFunc(o:String, n:Int):Unit = {
  if (n > 0) {
    println(o)
    recursiveFunc(o, n - 1)
  }
}

def iterate(output:String,times:Int):Unit = {
  recursiveFunc(output, times)
}

iterate("Hi",4)


