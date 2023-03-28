object IfElseStatement {
  def main(args:Array[String]):Unit ={
    println("if else statement method 1");
    val reference:Int=200;
    if(reference>=20)
      println("greater than 20");
    else
      println("less than 20")


    println("if else statement method 2");
    if(reference>20){
      println("greater than 20");
    }else{
      println("less then 20");
    }

    println("if else statement method 3");
    println(if(reference>20) "greater then 20" else "less than 20");

  }
}
