package GenericsUsage
//1,2,3
class StacksUsage[Generics]{
  var list :List[Generics] = Nil;

  /**
   * pushes the element parameter to the stack
   * @param element
   */
  def push(element:Generics): Unit = {
    list=element::list;
  }

  /**
   * gets the top most element
   * @return
   */
  def peek():Generics={
    return list.head;
  }

  /**
   * removes the top most element
   * @return
   */
  def pop():Generics={
    var currentTop=list.head;
    list=list.tail
    return currentTop;
  }

}
object StackImpl {
  def main(args:Array[String]):Unit={
    val stack = new StacksUsage[Int];
    stack.push(1);
    stack.push(2);
    stack.push(3);
    println(stack.peek());
    println(stack.list)
    println(stack.pop())
    println(stack.peek())
    println(stack.list)
  }
}
