def calculateInterest(deposit:Double):Double={
  val interestRate: Double => Double = {
    case x if x <= 20000 => 0.02
    case x if x <= 200000 => 0.04
    case x if x <= 2000000 => 0.035
    case _ => 0.065
  }
  deposit * interestRate(deposit)
}

def main(args:Array[String]):Unit={
val depositAmount = 250000.0
val interestEarned = calculateInterest(depositAmount)
println("The interest earned on a deposit of Rs. "+depositAmount+" is Rs. "+interestEarned)
}