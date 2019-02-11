object higherOrder extends App{
  def sum(x:Double, y:Double, z:Double):Double = x+y+z
  def prod(x:Double, y:Double, z:Double):Double = x*y*z
  def min(x:Double, y:Double, z:Double):Double = x min y min z

  def combine(x:Double, y:Double, z:Double, f:(Double, Double) => Double):Double = f(f(x,y), z)
  println("Sum is: " + sum(2, 3, 4))
  println("Sum is: " + prod(2, 3, 4))
  println("Min number is: " + min(2, 3, 4))
  println("Min number is: " + combine(2, 3, 4, (x, y) => x min y))
  println("Product is: " + combine(2, 3, 4, (x, y) => x * y))
  println("Sum is: " + combine(2, 3, 4, (x, y) => x + y))
}