package ScalaClassObjectWithExtendsExample

class PointExtendsClass(x:Int, y:Int,z:Int) extends PointClass(x:Int,y:Int) {
  var zc:Int=z;
  def move(dx:Int,dy:Int,dz:Int):Unit={
    xc=xc+dx;
    yc=yc+dy;
    zc=zc+dz;
    println(s"point moved by \nvalue of x is $x \nvalue of y is $y \nvalue of z is $z");
  }
}
