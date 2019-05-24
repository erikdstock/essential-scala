
object Playground {

  case class Constructible(x: Int, y: Int)

  val c = Constructible(4, 2)

  val Constructible(a, b) = c

  println(a, b)

}

case class Constructible(x: Int, y: Int)

val c = Constructible(4, 2)

val Constructible(a, b) = c

println(a, b)
