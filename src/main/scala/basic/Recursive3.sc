def recursiveFunc(f:String, s:String, n:Int):Unit = n match{
  case n > 0 => n match {
    case n % 3 == 0 & n % 5 == 0 => println(f.concat(s))
    case n % 3 == 0 => println(f)
    case n %5 == 0 => println(s)
    case _ => println(n)
  }
    recursiveFunc(f,s,n - 1)
}

def iterate(first:String,second:String,times:Int):Unit = {
  recursiveFunc(first, second, times)
}

iterate("Fizz", "Buzz",15)

