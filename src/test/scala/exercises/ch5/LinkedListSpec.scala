package exercises.ch5

import exercises.TestUtil.SpecMixin

class LinkedListSpec extends SpecMixin {

  "LinkedList (5.1.3.1-2)" must {
    "#length" must {
      "passes book specs" in {
        val example = Cons(1, Cons(2, Cons(3, End())))
        assert(example.length == 3)
        assert(example.tail.length == 2)
        assert(End().length == 0)

      }
    }

    "#contains" when {
      "passes book specs" in {
        val example = Cons(1, Cons(2, Cons(3, End())))
        assert(example.contains(3) == true)
        assert(example.contains(4) == false)
        assert(End().contains(0) == false)
        // This should not compile
        // example.contains("not an Int")
      }
    }

    "#apply" must {
      val example = Cons(1, Cons(2, Cons(3, End())))

      "with an A" in {
        assert(example(0) == 1)
        assert(example(1) == 2)
        assert(example(2) == 3)
      }

      "with an exception" in {
        assert(try {
          example(3)
          false
        } catch {
          case _: Exception => true
        })
      }

      "with a Result[A]" in {
        assert(example.applyWithResult(0) == Success(1))
        assert(example.applyWithResult(1) == Success(2))
        assert(example.applyWithResult(2) == Success(3))
        assert(example.applyWithResult(3) == Failure("Index out of bounds"))
      }
    }
  }

}
