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

  def sort(input:String*):Unit = {
    val key:ArrayBuffer[String] = ArrayBuffer()
    input.foreach{word => wordArray().foreach { element =>
      if (element.toCharArray.distinct.toSet.subsetOf(word.toCharArray.toSet))
        key += element
    }
      if (key.nonEmpty)
        println(key)
    }

  }
}

object start {
  def main(args: Array[String]): Unit = {
    val run = new KeyboardSolutionV2()
    run.sort("bnik")
  }
}
