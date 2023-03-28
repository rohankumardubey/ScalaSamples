object ForLoop {
  def main(arg:Array[String]):Unit={
    println("\nfor loop method 1");
    for(i<-1 to 4){
      println("for loop"+i);
    }

    println("\nfor loop method 2");
    for(j <- 1.to(10)){
      println("for loop "+j);
    }

    println("\nfor loop method 3");
    for(k <- 1 until 10){
      println("for loop "+k);
    }

    println("\nfor loop method 4");
    for(l <-1.until(10)){
      println("for loop "+l);
    }

    println("\nnested for loops");
    for(x <- 1 to 4;y <- 1 to 4){
      println(f"nested for loop ($x%d,$y%d)");
    }

    println("\nfor loop using list");
    val lst = List(1,2,3,4,5);
    for(temp <- lst){
      println("loop elements "+temp);
    }

    println("\nfor loop using list and filter");
    val list=List(1,2,3,4,5,6,7,8);
    for(temp <- list; if temp>6 ){
      println("loop elements "+temp);
    }

    println("\nfor loop using list,with filter and yield");
    val listValue = List(1,2,3,4,5,6,7,8,9,10);
    val result = for(temp <- listValue; if temp <= 5) yield { temp * temp}
    for(temp <- result){
      println("loop elements "+temp)
    }
  }
}
