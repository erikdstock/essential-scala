package exercises.ch5

import exercises.TestUtil.SpecMixin

class TreeSpec extends SpecMixin {
  "Tree" should {

    "be a Tree" ignore {
      Tree.exampleTree shouldBe a[Tree[_]]
    }

    "have #fold" ignore {
//      Node(Node(Leaf(1), Leaf(2)), Node(Leaf(3), Leaf(4))).fold(0)(_ + _).shouldBe 10
      val tenTree = Node(Node(Leaf(1), Leaf(2)), Node(Leaf(3), Leaf(4)))

//      val sum = (l, r) => {
//        l + r
//      }

      tenTree.fold[Int](a=>a)((l, r) => l + r)  shouldBe 10
//
      tenTree.fold[Tree[String]](a => Leaf(a.toString * 2))( (x, y) => Node(x, y)) shouldBe Node(Node(Leaf("11"), Leaf("22")), Node(Leaf("33"), Leaf("44")))
    }

    "fold example into a sentence" ignore {
      Tree.foldedSolution shouldBe "To iterate is human, to recurse divine"
    }
  }
}
