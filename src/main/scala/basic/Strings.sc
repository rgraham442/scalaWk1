def item(input:String,number:Int):String = {
  input.substring(input.length - number, input.length)
}

item("Hello", 3)