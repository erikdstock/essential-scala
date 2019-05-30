package exercises.ch5

import exercises.TestUtil.SpecMixin

class LinkedListSpec extends SpecMixin {

  "LinkedList (5.1.1-2)" ignore {
    "#length" when {
      "passes book specs" ignore {
        val example = Pair(1, Pair(2, Pair(3, End())))
        assert(example.length == 3)
        assert(example.tail.length == 2)
        assert(End().length == 0)

      }
    }

    "#contains" when {
      "passes book specs" ignore {
        val example = Pair(1, Pair(2, Pair(3, End())))
        assert(example.contains(3) == true)
        assert(example.contains(4) == false)
        assert(End().contains(0) == false)
        // This should not compile
        // example.contains("not an Int")
      }
    }

    "#apply" when {
        val example = Pair(1, Pair(2, Pair(3, End())))
      "with an A" ignore {
//        assert(example(0) == 1)
//        assert(example(1) == 2)
//        assert(example(2) == 3)
      }
      "with an exception" ignore {
//        assert(try {
//          example(3)
//          false
//        } catch {
//          case _: Exception => true
//        })
      }
      "with a Result[A]" ignore {
        assert(example(0) == Success(1))
        assert(example(1) == Success(2))
        assert(example(2) == Success(3))
        assert(example(3) == Failure("Index out of bounds"))
      }
    }
  }

}
