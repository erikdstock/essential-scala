package exercises.ch5

sealed trait LinkedList[A] {
  def length: Int = ???

  def contains(wat: A): Boolean = ???

  def apply(i: Int): Result[A] = ???
}

final case class End[A]() extends LinkedList[A]
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
