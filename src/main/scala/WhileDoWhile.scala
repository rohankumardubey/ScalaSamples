object WhileDoWhile {
  def main(arg:Array[String]):Unit={
    var counter:Int=0;
    println("while loop")
    while(counter<10){
      println("counter value in while loop "+counter);
      counter+=1;
    }

    println("do while loop");
    do{
      counter+=1
      println("counter value in do while loop "+counter);
    }while(counter<0);
  }
}
