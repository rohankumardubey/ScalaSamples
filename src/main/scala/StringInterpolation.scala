object StringInterpolation {
  def main(args:Array[String]): Unit ={
      val name:String = "sample";
      val age:Int = 10;
    println(name+" is "+age);
    //string format
    println(s"$name is $age years old");
    //string with type format
    println(f"$name%s is $age%d years old");
    //string formatting
    println(s"Hello \nscala");
    //raw format without formatting
    println(raw"Hello \nscala");
  }
}
