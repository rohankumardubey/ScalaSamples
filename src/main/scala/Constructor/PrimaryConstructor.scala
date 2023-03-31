package Constructor

class PrimaryConstructor(name:String,age:Int) {
  def details(): Unit = {
    println(s"person name is : $name and age is : $age")
  }
}

object personDetails{
  def main(arg:Array[String]):Unit={
    val primaryConstructor = new PrimaryConstructor("sample",20);
    primaryConstructor.details();
  }
}
