object MatchExpressions {
  def main(arg:Array[String]):Unit={
    val age:Int = 20;
    age match {
      case 30 => println("age is 30");
      case 40 => println("age is 40");
      case 50 => println("age is 50");
      case 60 => println("age is 60");
      case _ => println("cannot be estimate the age");
    }

    val result:Int = 300;
    result match {
      case 300 | 400 | 500 | 600 => println("less than 600 ");
      case 700 | 800 | 900 | 1000 => println("greater than 600");
      case _ => println("cannot determined");
    }
  }
}
