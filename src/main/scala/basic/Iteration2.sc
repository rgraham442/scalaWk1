def iterateRec(output:String,times:Int):Unit = {
  for (i <- 1 to times)
    println(output * times)
}

iterateRec("Hello",5)

def iterateSq(output:String,times:Int):Unit = {
  for (i <- 1 to times)
    println((output + " ") * times)
}

iterateSq("Hello",3)