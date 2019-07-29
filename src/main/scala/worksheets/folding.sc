val x: List[Int] = List(1, 2, 3) // same as 1 :: 2 :: Nil

x.foldLeft("")(_ + _.toString())

x.foldLeft("")((s, i) => s + i.toString())

x.foldLeft("") {
  case (s, i) => s + i.toString()
}

//=>
// s + i.toString() )

//winningBidOpt.map(_.user)

Some(5).map(_ * 5)

//None.map(_ * 5)


object Foo {

  trait Tree[A] {

    def fold[B](leafFn: A => B)(nodeFn: (B, B) => B): B = {
      this match {
        case Leaf(value) => leafFn(value)
        case Node(left, right) => {
          val finalLeft: B = left.fold(leafFn)(nodeFn)
          val finalRight: B = right.fold(leafFn)(nodeFn)

          nodeFn(finalLeft, finalRight)
        }
      }
    }

    override def toString: String = fold[String](x => x.toString())((leftResult, rightResult) => leftResult + " | " + rightResult)
  }

  case class Leaf[A](value: A) extends Tree[A]

  case class Node[A](left: Tree[A], right: Tree[A]) extends Tree[A]

}
  val tree = Foo.Node(Foo.Leaf(4), Foo.Leaf(2))
  tree.toString()

