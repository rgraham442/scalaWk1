case class Num(first:Int,second:Int)
def sum(res: Any):Int = res match {
  case Num(first,second) if first > 21 & second > 21 => 0
  case Num(first,second) if first > 21 => second
  case Num(first,second) if second > 21 => first
  case Num(first,second) if first > second & first <= 21 => first
  case Num(first,second) if second > first & second <= 21 => second
  case _ => 0
}

sum(Num(1,20))
sum(Num(18,4))
sum(Num(22,2))
sum(Num(8,25))
sum(Num(24,29))
sum(Num(0,4))
