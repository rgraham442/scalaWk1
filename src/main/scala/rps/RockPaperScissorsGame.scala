package rps

object RockPaperScissorsGame {

  def main(args: Array[String]): Unit = {
    game()
  }

  val random = scala.util.Random

  var end = false
  var playerWins = 0
  var aiWins = 0
  var draw = 0

  case class Number (ran:Int)
  def aiChoice (num:Any):String = num match {
    case Number(0) => "Rock"
    case Number(1) => "Paper"
    case Number(2) => "Scissors"
    case _ => "Invalid"

  }

  def play (player:String, ai:String):Unit = (player,ai) match {
    case ("Rock","Scissors") => playerWins = playerWins + 1
    case ("Rock","Paper") => aiWins = aiWins + 1
    case ("Rock","Rock") => draw = draw + 1

    case ("Paper","Rock") => playerWins = playerWins + 1
    case ("Paper","Scissors") => aiWins = aiWins + 1
    case ("Paper","Rock") => draw = draw + 1

    case ("Scissors","Paper") => playerWins = playerWins + 1
    case ("Scissors","Rock") => aiWins = aiWins + 1
    case ("Scissors","Scissors") => draw = draw + 1

    case _ => end=true
  }

  def game():Unit = {
    var playerMove = ""
    val aiMove = aiChoice(Number(random.nextInt(3)))

    while (!end) {
      println("Welcome player to Rock! Paper! Scissors!")
      println(s"The current scores are: \nPlayer:$playerWins \nAI:$aiWins \nDraws:$draw ")
      println("Please enter your choice:")
      playerMove = scala.io.StdIn.readLine()
      println(s"You chose: $playerMove, They chose: $aiMove")

    }

  }

}
