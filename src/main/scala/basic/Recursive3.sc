var f1 = ""
var f2 = ""

def recursiveFunc(n:Int):Unit = {
  if (n > 0) {
    if (n % 3 == 0 & n % 5 == 0) println(f1.concat(f2))
    else if (n % 3 == 0) println(f1)
    else if (n %5 == 0) println(f2)
    else println(n)
    recursiveFunc(n - 1)
  }
}

def iterate(first:String,second:String,times:Int):Unit = {
  f1 = first
  f2 = second
  recursiveFunc(times)
}

iterate("Fizz", "Buzz",15)

