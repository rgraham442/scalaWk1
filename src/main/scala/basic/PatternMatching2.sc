def swap(number:Any):Any = number match {
  case number:Tuple2[Int, Int] => number.swap
  case number:Array[Int] if number.length == 2 => number.reverse.mkString(" ")
  case number:List[Int] if number.length == 2 => number.reverse.mkString(" ")
  case _ => s"Not a pair"
}


val ls = List(2,4)
val ar = Array(6,1)
val ar2 = Array("Hi", "there")
val tu = Tuple2(3,8)

swap(ls)
swap(ar)
swap(ar2)
swap(tu)