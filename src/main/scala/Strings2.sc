def input(first:String,second:String,third:Char,fourth:Char):String = {
  val result = first.concat(second)
  result.replace(third,fourth)
}

input("Ha","llo",'a','e')