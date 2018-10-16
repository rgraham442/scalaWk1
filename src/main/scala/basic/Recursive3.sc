def recursiveFunc(f:String, s:String, n:Int):Any = n match{
  case n if n > 0 => n match {
    case n if n % 3 == 0 & n % 5 == 0 => println(f.concat(s))
    case n if n % 3 == 0 => println(f)
    case n if n %5 == 0 => println(s)
    case _ => println(n)
  }
    recursiveFunc(f,s,n - 1)
}

def iterate(first:String,second:String,times:Int):Unit = {
  recursiveFunc(first, second, times)
}

iterate("Fizz", "Buzz",15)

