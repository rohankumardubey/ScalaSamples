package GenericsUsage
//1,2,3
class StacksUsage[A]{
  var list:List[A]=Nil;
  def push(element:A):Unit={
    list=element::list;
  }

  def peek():A={
    return list.head
  }

  def pop():A={
    val currentTop=list.head;
    list=list.tail
    return currentTop
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
