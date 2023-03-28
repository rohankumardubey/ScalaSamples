object FunctionSample {

  object Math{
    def add(x:Int,y:Int):Int={
      return x+y;
    }

    def square(x:Int):Int=x*x;
  }
  //function with return
  def add(x:Int,y:Int):Int={
    return x+y;
  }

  //function with no return keyword
  def subtract(x:Int,y:Int):Int={
     x-y;
  }

  //function with no curly braces
  def multiply(x: Int, y: Int): Int = x * y;

  //function in equation form
  def divide(x:Int,y:Int)=x/y

  def main(arg:Array[String]):Unit={
    println(add(1,2));
    println(subtract(2,1));
    println(multiply(3,4));
    println(divide(4,2));
    println(Math.add(4,5));
    println(Math.square(4));
  }
}
