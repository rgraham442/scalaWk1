def iterateRec(output:String,times:Int):Unit = {
  for (i <- 1 to times)
    println(output * times)
}

iterateRec("H",5)

def iterateSq(output:String,times:Int):Unit = {
  for (i <- 1 to times)
    println((output + " ") * times)
}

iterateSq("H",3)