package exercises.ch5

import exercises.TestUtil.SpecMixin

class TreeSpec extends SpecMixin {
  "Tree" should {

    "have #fold" in {
      val tenTree = Node(Node(Leaf(1), Leaf(2)), Node(Leaf(3), Leaf(4)))


      tenTree.fold[Int](a => a)((l, r) => l + r) shouldBe 10
      //
      tenTree.fold[Tree[String]](a => Leaf(a.toString * 2))((x, y) => Node(x, y)) shouldBe Node(Node(Leaf("11"), Leaf("22")), Node(Leaf("33"), Leaf("44")))
    }

    "fold example into a sentence (5.3.4.1)" in {
      val exampleTree: Tree[String] = Node(Node(Leaf("To"), Leaf("iterate")),
        Node(Node(Leaf("is"), Leaf("human,")),
          Node(Leaf("to"), Node(Leaf("recurse"), Leaf("divine")))))

      val result: String = exampleTree.fold(leaf => leaf)((l, r) => s"$l $r")
            result shouldBe "To iterate is human, to recurse divine"
    }
  }
}
