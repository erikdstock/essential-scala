package exercises.ch5

sealed trait Tree[A] {
//  def fold[B](???)(???) = ???
}

final case class Leaf[A](el: A) extends Tree[A]

final case class Node[A](l: Tree[A], r: Tree[A]) extends Tree[A]

object Tree {
  // From the book: 5.3.4.1
  val exampleTree: Tree[String] = Node(Node(Leaf("To"), Leaf("iterate")),
    Node(Node(Leaf("is"), Leaf("human,")),
      Node(Leaf("to"), Node(Leaf("recurse"), Leaf("divine")))))

  val foldedSolution = ???
}
