package ScalaClassObjectWithExtendsExample

class PointClass(x:Int,y:Int) {
  var xc: Int = x
  var yc:Int = y;

  def move(dx:Int,dy:Int):Unit={
    xc=xc+dx;
    yc=yc+dy;
    println(s"point moved by \nvalue of x is $x \nvalue of y is $y");
  }
}

