object question2 {
  def print(num:Int):Unit={
    if(num==0){
      println("Number is Zero")
    }
    else if(num<0){
      println("Number is less than zero")
    }
    else if(num%2==0){
      println("Number is even")
    }
    else{
      println("Number is odd")
    }
  }

  def main(args:Array[String]):Unit= {
    if (args.length == 0) {
      println("No input is provided")
    }
    else {
      val number = args(0).toInt
      print(number)
    }
  }
}
