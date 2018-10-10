case class Num(first:Int,second:Int)
def sum(res: Any, mod:Boolean):Int = res match {
  case Num(0,second) => second
  case Num(first,0) => first
  case Num(0,0) => 0
  case Num(first,second) if mod == true => first + second
  case Num(first,second) if mod == false => first * second
  case _ => 0
}

sum(Num(1,4),true)

sum(Num(2,5),false)

sum(Num(0,2),true)

sum(Num(7,0),false)

sum(Num(0,0),true)