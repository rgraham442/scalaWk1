package advanced

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

class Anagram {
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
    val holder:mutable.HashMap[String,Any] = mutable.HashMap[String,Any]()
    input.foreach{word =>
      wordArray().foreach { element =>
        if (element.toCharArray.sorted.sameElements(word.toCharArray.sorted))
          key += element
        holder.map(input => key)
      }
    }
    println(key)
  }
}

object start {
  def main(args: Array[String]): Unit = {
    val run = new Anagram()
    run.sort("smile", "tab")
  }
}
