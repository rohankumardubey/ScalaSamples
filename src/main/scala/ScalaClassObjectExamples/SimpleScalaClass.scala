package ScalaClassObjectExamples

class SimpleScalaClass(val1:Int,val2:Int) {
  var x: Int = val1;
  var y: Int = val2;
  def move(dx:Int,dy:Int):Unit={
    x=x+dx;
    y=y+dy;
    println(s"point moved by \nvalue of x = $x \nvalue of y = $y");
  }
}
