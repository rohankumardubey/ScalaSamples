package ScalaClassObjectWithExtendsExample

object PointObject {
  def main(args:Array[String]):Unit={
   val pointClass = new PointClass(1,2);
   val pointExtendsClass = new PointExtendsClass(1,2,3);
   pointClass.move(1,2);
   pointExtendsClass.move(1,2,3);
  }
}
