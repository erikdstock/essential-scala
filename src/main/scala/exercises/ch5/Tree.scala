package exercises.ch5

sealed trait Tree[A] {
  def fold[B](leaf: A => B)(node: (B, B) => B): B = ???
}

final case class Leaf[A](el: A) extends Tree[A]

final case class Node[A](l: Tree[A], r: Tree[A]) extends Tree[A]


