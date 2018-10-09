def iterate(first:String,second:String, number:Int):Unit = {
  for (i <- 1 to number)
    if (i %3 == 0 & i %5 == 0) println(first.concat(second))
    else if (i % 3 == 0) println(first)
    else if (i %5 == 0) println(second)
    else println(i)
}

iterate("Fizz","Buzz",15)