var output = ""

def recursiveFunc(n:Int):Unit = {
  if (n > 0) {
    println(output)
    recursiveFunc(n - 1)
  }
}

def iterate(output2:String,times:Int):Unit = {
  output = output2
  recursiveFunc(times)
}

iterate("Hi",4)


