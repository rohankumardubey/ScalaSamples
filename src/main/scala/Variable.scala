object Variable {
  def main(args:Array[String]): Unit ={
    //types of data variables in scala
    val int:Int = 2;
    val string:String = "sample";
    val boolean:Boolean = true;
    val short:Short = 123;
    val byte:Byte = 12;
    val char:Char='a';
    val long:Long = 1234L;
    val float:Float=123f;
    val double:Double=1234d;
    val intVal:Int = {val val1:Int =10;val val2:Int=12;val1+val2}
    lazy val lazyVal :Int = 500;
    println("hello scala greetings");
    println("integer value is "+int);
    println("string value is "+string);
    println("boolean value is "+boolean);
    println("Short value is "+short);
    println("byte value is "+byte);
    println("character value is "+char)
    println("long value is "+long);
    println("float value is "+float);
    println("double value is "+double)
    println("summation value is "+intVal)
    println("lazy value evaluation "+lazyVal)
  }
}
