package exercises

package object ch5 {
  /*
  ## 5.1.3.{1-2} Generic List
  Our IntList type was defined as

    sealed trait IntList
    final case object End extends IntList
    final case class Pair(head: Int, tail: IntList) extends IntList

  1. Change the name to LinkedList and make it generic in the type of data stored in the list.
  2.  Implement `length`, `contains`, and `apply`

  ## 5.3.4.1


  A binary tree can be defined as follows:

  A Tree of type A is a Node with a left and right Tree or a Leaf with an element of type A.
  - Implement this algebraic data type along with a fold method.

  - Using fold convert the following Tree to a String

  val tree: Tree[String] =
    Node(Node(Leaf("To"), Leaf("iterate")),
         Node(Node(Leaf("is"), Leaf("human,")),
              Node(Leaf("to"), Node(Leaf("recurse"), Leaf("divine")))))
  Remember you can append Strings using the + method.

  

  ### Notes
  - 5.3 -   fold, placeholder syntax, converting methods to functions
  - 5.3.3 - multiple parameter lists
  - 5.5.3 - functors & monads
   */

  sealed trait Result[A]
  case class Success[A](result: A) extends Result[A]
  case class Failure[A](reason: String) extends Result[A]
}
