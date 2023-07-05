object question1 {
  def interest(deposit:Int):Double= {
    val interest = {
      if (deposit <= 20000) {
        deposit * 0.02
      }
      else if (deposit <= 200000) {
        deposit * 0.04
      }
      else if (deposit <= 2000000) {
        deposit * 0.035
      }
      else {
        deposit * 0.65
      }
    }
    interest
  }
def main(args:Array[String]):Unit={
 val depositAmount=35000
  val interestAmount=interest(depositAmount)
  println("Interest : "+interestAmount)
}
}
