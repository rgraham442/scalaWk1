def recursiveFib(i:Int, f1:Int,f2:Int):Unit = i match{
  case i if i > 0 => println(f1)
    val sum = f1+f2
    recursiveFib(i - 1,f2,sum)
  case _ => println("End of sequence")
}

def iterate(num:Int): Unit = {
  val f = 0
  val s = 1
  recursiveFib(num,f,s)
}

iterate(1)
iterate(8)
