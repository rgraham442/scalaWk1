def sum(first:Int,second:Int,modifier:Boolean):Int = (first, second) match {
  case (0, 0) => 0
  case (0, second) => second
  case (first, 0) => first
  case (first, second) if modifier => first+second
  case (first, second) if !modifier => first*second
  case _ => 0
}

sum(1,4,true)

sum(2,5,false)

sum(0,2,true)

sum(7,0,false)

sum(0,0,true)