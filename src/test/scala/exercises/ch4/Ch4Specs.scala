package exercises.ch4

import exercises.TestUtil.SpecMixin


class Ch4Specs extends SpecMixin {

  "Calculator (4.5.6.2)" must {
    "pass the tests from the book" in {
      assert(Calculator.+(Success(1), 1) == Success(2))
      assert(Calculator.-(Success(1), 1) == Success(0))
    }
  }

  "IntList (4.6.3.1)" must {
    "pass the tests from the book" in {
      val example = Pair(1, Pair(2, Pair(3, End)))

      assert(example.length == 3)
      assert(example.tail.length == 2)
      assert(End.length == 0)
    }
  }
  "Tree (4.6.3.2)" must {
    val example: Tree = Node(
      Node(
        Leaf(1),
        Node(
          Leaf(2),
          Leaf(3)
        )
      ),
      Node(
        Leaf(4),
        Leaf(5)
      )
    )
    "have a sum" in {
      example.sum shouldBe 15
    }
    "have a double" in {
      val expected: Tree = Node(
        Node(
          Leaf(2),
          Node(
            Leaf(4),
            Leaf(6)
          )
        ),
        Node(
          Leaf(8),
          Leaf(10)
        )
      )
      example.double shouldBe expected
    }
  }


}
