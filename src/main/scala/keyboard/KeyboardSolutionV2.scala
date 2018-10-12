package keyboard

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

class KeyboardSolutionV2 {

  val bufferedSource = Source.fromFile("src/ExampleList.txt")

  def wordArray():ArrayBuffer[String] = {
    val words = ArrayBuffer[String]()

    for (line <- bufferedSource.getLines) {
      words += line.toString
    }
    words
  }

  def sort(input:String):Unit = {
    val letter:ArrayBuffer[Char] = ArrayBuffer()
    input.foreach(letter +=)



  }
  bufferedSource.close
}

object start {
  def main(args: Array[String]): Unit = {
    val run = new KeyboardSolutionV2()
    println(run.wordArray())
  }
}
