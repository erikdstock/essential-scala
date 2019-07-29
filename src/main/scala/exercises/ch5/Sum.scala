package exercises.ch5

sealed trait Sum[L, R] {
  def fold[B](left: L => B)(right: R => B): B = this match {
    case Left(v) => left(v)
    case Right(v) => right(v)
  }
}

final case class Left[L, R](value: L) extends Sum[L,R]
final case class Right[L, R](value: R) extends Sum[L,R]
