def input(first:String,second:String,third:Char,fourth:Char):String = {
  first.concat(second).replace(third,fourth)
}

input("Ha","llo",'a','e')