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
  def initAIlChoice (num:Any):String = num match {
    case Number(0) => "Rock"
    case Number(1) => "Paper"
    case Number(2) => "Scissors"
    case _ => "Invalid"

  }

  def ai (rk:Int,pr:Int,ss:Int):String =
    (rk, pr, ss) match {
      case (rk,pr,ss) if rk >= pr & rk > ss => "Paper"
      case (rk,pr,ss) if pr >= ss & pr > rk => "Scissors"
      case (rk,pr,ss) if ss >= rk & ss > pr => "Rock"
      case _ => initAIlChoice(Number(random.nextInt(3)))
    }


  def play (player:String, ai:String):Unit = (player,ai) match {
    case ("Rock","Scissors") => playerWins += 1
      println("They chose: Scissors\nYou Win!\n")
    case ("Rock","Paper") => aiWins += 1
      println("They chose: Paper\nYou Lose!\n")
    case ("Rock","Rock") => draw += 1
      println("They chose: Rock\nIt's a Draw!\n")

    case ("Paper","Rock") => playerWins += 1
      println("They chose: Rock\nYou Win!\n")
    case ("Paper","Scissors") => aiWins += 1
      println("They chose: Scissors\nYou Lose!\n")
    case ("Paper","Paper") => draw += 1
      println("They chose: Paper\nIt's a Draw!\n")

    case ("Scissors","Paper") => playerWins += 1
      println("They chose: Paper\nYou Win!\n")
    case ("Scissors","Rock") => aiWins += 1
      println("They chose: Rock\nYou Lose!\n")
    case ("Scissors","Scissors") => draw = draw + 1
      println("They chose: Scissors\nIt's a Draw!\n")

    case ("Quit",_) => end=true
    case _ => println("Input error")
  }

  def game():Unit = {

    var rock = 0
    var paper = 0
    var scissors = 0

    var playerMove = ""
    val aiMove = ai(rock,paper,scissors)

    while (!end) {
      println("Welcome player to Rock! Paper! Scissors!")
      println(s"The current scores are: \nPlayer:$playerWins \nAI:$aiWins \nDraws:$draw ")
      println("Please enter your choice:")
      playerMove = scala.io.StdIn.readLine()

      play(playerMove,aiMove)


    }

  }

}
