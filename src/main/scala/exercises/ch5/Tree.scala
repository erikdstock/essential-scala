package exercises.ch5

sealed trait Tree[A] {
  def fold[B](leafFn: A => B)(nodeFn: (B, B) => B): B = this match {
    case Node(l, r) => nodeFn(l.fold(leafFn)(nodeFn), r.fold(leafFn)(nodeFn))
    case Leaf(a) => leafFn(a)
  }
}

final case class Leaf[A](el: A) extends Tree[A]

final case class Node[A](l: Tree[A], r: Tree[A]) extends Tree[A]


