object TraitUsage {

  trait traitExample{
    def traitNonOverrideFunction(): Unit;
    def traitOverrideFunction(name:String):Unit={
      println(name+" is give");
    }
  }

  object traitImpl extends traitExample{
    def traitNonOverrideFunction(): Unit = {
      println("non override here");
    }

    override def traitOverrideFunction(name:String):Unit = {
      if(name.equals("sample")){
        println(name+" override here");
      }else{
        println("override here");
      }
    }
  }

  def main(args:Array[String]):Unit={
    traitImpl.traitNonOverrideFunction();
    traitImpl.traitOverrideFunction("here");
  }

}
