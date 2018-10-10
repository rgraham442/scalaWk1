case class Num(first:Int,second:Int,third:Int)
def sum(res:Any):Int = res match {
  case Num(first,second,third) if first!=second & second!=third => first+second+third
  case Num(first,second,third) if first!=second & second==third => first
  case Num(first,second,third) if first==third & second!=third => second
  case Num(first,second,third) if first==second & third!=first => third
  case _ => 0
}

sum(Num(1,2,3))
sum(Num(3,3,3))
sum(Num(1,1,2))
sum(Num(1,6,6))
sum(Num(4,2,4))