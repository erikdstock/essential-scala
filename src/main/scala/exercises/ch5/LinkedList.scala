package exercises.ch5

sealed trait LinkedList[A] {
  def length: Int = this match {
    case End() => 0
    case Cons(h, t) => 1 + t.length
  }

  def contains(wat: A): Boolean = this match {
    case End() => false
    case Cons(h, t) => if (h == wat) true else t.contains(wat)
  }

  def apply(i: Int): A = {

    def go(l: LinkedList[A], current: Int): A = l match {
      case End() => throw new Exception (s"$i element not found")
      case Cons(h, t) => {
        if (i == 1) println("***", current == i, h, t)
        if (current == i) h else go(t, current + 1)
      }
    }

    go(this, 0)
  }

  def applyWithResult(i: Int): Result[A] = {
    def go(l: LinkedList[A], current: Int): Result[A] = l match {
      case End() => Failure[A]("Index out of bounds")
      case Cons(h, t) => if (current == i) Success(h) else go(t, current + 1)
    }
    go(this, 0)

  }
}

final case class End[A]() extends LinkedList[A]
final case class Cons[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
