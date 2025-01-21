```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge < 0) throw new IllegalArgumentException("Age cannot be negative")
    _age = newAge
  }
}

object Main extends App {
  val obj = new MyClass("John")
  obj.age = 30 // this works
  // println(obj.age) // this works
  obj.age = -1 // throws IllegalArgumentException
}
```