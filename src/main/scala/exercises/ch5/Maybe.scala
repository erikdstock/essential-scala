package exercises.ch5

sealed trait Maybe[A] {
  def isEmpty: Boolean = this match {
    case Full(_) => false
    case _ => true
  }

  def fold[B](empty: B, full: A => B): B = this match {
    case Empty() => empty
    case Full(a) => full(a)
  }
}

case class Full[A](get: A) extends Maybe[A]
case class Empty[A]() extends Maybe[A]