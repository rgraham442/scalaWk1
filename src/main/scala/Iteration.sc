def iterate(output:String,times:Int):Unit = {
  for (i <- 1 to times) println(output)
}

iterate("Hi",3)