import scala.io.StdIn.readInt

@main def numberClassifier():Unit={
  println("Enter an integer: ")
  val input = readInt()

  val result = input match{
    case x if x <= 0 => "Negative/Zero is given"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }
  println(result)
}
