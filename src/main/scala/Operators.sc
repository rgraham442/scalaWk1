def sum(first:Int,second:Int,modifier:Boolean):Int = {
  if (first == 0)
    second
  else if (second == 0)
    first
  else if (first == 0 && second == 0)
    0
  else if (modifier == true)
    first + second
  else
    first * second
}

sum(1,4,true)

sum(2,5,false)

sum(0,2,true)

sum(7,0,false)

sum(0,0,true)