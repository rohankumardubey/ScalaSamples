package Singleton

/**
 * using the created singleton object created
 */
object SingletonObject {
  SingletonImpl.greet();
}

/**
 * creating an singleton object
 */
object SingletonImpl{
  def greet():Unit={
    println("Hi !!");
  }
}
