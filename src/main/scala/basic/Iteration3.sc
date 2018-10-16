def iterate(first:String,second:String, number:Int):Unit = {
  for (i <- 1 to number)
    i match {
    case i if i % 3 == 0 & i % 5 == 0 => println(first.concat(second))
    case i if i % 3 == 0 => println(first)
    case i if i % 5 == 0 => println(second)
    case _ => println(i)
  }
}

iterate("Fizz","Buzz",15)