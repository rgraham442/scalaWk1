package rps

object RockPaperScissorsGame {

  val random = scala.util.Random

  var end = false
  var playerWins = 0
  var aiWins = 0
  var draw = 0
  var rounds = 0

  def main(args: Array[String]): Unit = {
    choice()
  }

  def choice(): Unit = {
    var start = ""

    println("Do you want to PLAY or WATCH?")

    start = scala.io.StdIn.readLine()
    if (start == "PLAY" || start == "play" || start == "p") game()
    if (start == "WATCH"|| start == "watch"|| start == "w"  ) aiGame()
  }

  case class Number(ran: Int)
  def initAIlChoice(num: Any): String = num match {
    case Number(0) => "Rock"
    case Number(1) => "Paper"
    case Number(2) => "Scissors"
    case _ => "Invalid"
  }

  def ai(rk: Int, pr: Int, ss: Int): String =
    (rk, pr, ss) match {
      case (rk, pr, ss) if rk >= pr && rk > ss && rk > 1 => "Paper"
      case (rk, pr, ss) if pr >= ss && pr > rk && pr > 1 => "Scissors"
      case (rk, pr, ss) if ss >= rk && ss > pr && ss > 1 => "Rock"
      case _ => initAIlChoice(Number(random.nextInt(3)))
    }


  def play(player: String, ai: String): Unit = {
    rounds += 1

    (player, ai) match {
      case ("Rock", "Scissors") => playerWins += 1
        println("They chose: Scissors\nYou Win!\n")
      case ("Rock", "Paper") => aiWins += 1
        println("They chose: Paper\nYou Lose!\n")
      case ("Rock", "Rock") => draw += 1
        println("They chose: Rock\nIt's a Draw!\n")

      case ("Paper", "Rock") => playerWins += 1
        println("They chose: Rock\nYou Win!\n")
      case ("Paper", "Scissors") => aiWins += 1
        println("They chose: Scissors\nYou Lose!\n")
      case ("Paper", "Paper") => draw += 1
        println("They chose: Paper\nIt's a Draw!\n")

      case ("Scissors", "Paper") => playerWins += 1
        println("They chose: Paper\nYou Win!\n")
      case ("Scissors", "Rock") => aiWins += 1
        println("They chose: Rock\nYou Lose!\n")
      case ("Scissors", "Scissors") => draw = draw + 1
        println("They chose: Scissors\nIt's a Draw!\n")

      case ("Quit", _) => end = true
      case _ => rounds -= 1
        println("Input error")
    }
  }

  def game(): Unit = {

    var rock = 0
    var paper = 0
    var scissors = 0

    var playerMove = ""

    println("Welcome player to Rock! Paper! Scissors!")

    while (!end) {
      println(s"It's Round $rounds and the current scores are: \nPlayer:$playerWins \nAI:$aiWins \nDraws:$draw ")
      println("Please enter your choice:")
      playerMove = scala.io.StdIn.readLine()
      if (playerMove == "Rock") rock += 1
      if (playerMove == "Scissors") scissors += 1
      if (playerMove == "Paper") paper += 1
      val aiMove = ai(rock, paper, scissors)
      play(playerMove, aiMove)
    }

  }

  def aiGame(): Unit = {

    var rock1 = 0
    var paper1 = 0
    var scissors1 = 0
    var rock2 = 0
    var paper2 = 0
    var scissors2 = 0
    var ender = ""

    while (!end) {

      val ai1Move = ai(rock2, paper2, scissors2)
      val ai2Move = ai(rock1, paper1, scissors1)

      if (ai1Move == "Rock") rock1 += 1
      if (ai1Move == "Scissors") scissors1 += 1
      if (ai1Move == "Paper") paper1 += 1
      if (ai2Move == "Rock") rock2 += 1
      if (ai2Move == "Scissors") scissors2 += 1
      if (ai2Move == "Paper") paper2 += 1
      aiPlay(ai1Move, ai2Move)
      println("Again?y/n")
      ender = scala.io.StdIn.readLine()
      if (ender == "n") end = true
    }
  }

  def aiPlay(one: String, two: String): Unit = (one, two) match {
    case ("Rock", "Scissors") =>
      println("Rock vs. Scissors\n1 Wins!\n")
    case ("Rock", "Paper") =>
      println("Rock vs. Paper\n2 Wins!\n")
    case ("Rock", "Rock") =>
      println("Rock vs. Rock\nIt's a Draw!\n")

    case ("Paper", "Rock") =>
      println("Paper vs. Rock\n1 Wins!\n")
    case ("Paper", "Scissors") =>
      println("Paper vs. Scissors\n2 Wins!\n")
    case ("Paper", "Paper") =>
      println("Paper vs. Paper\nIt's a Draw!\n")

    case ("Scissors", "Paper") =>
      println("Scissors vs. Paper\n1 Wins!\n")
    case ("Scissors", "Rock") =>
      println("Scissors vs. Rock\n2 Wins!\n")
    case ("Scissors", "Scissors") =>
      println("Scissors vs. Scissors\nIt's a Draw!\n")
    case _ => println("That shouldn't happen")
  }
}