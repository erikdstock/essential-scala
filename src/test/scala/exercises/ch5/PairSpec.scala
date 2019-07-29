package exercises.ch5

import exercises.TestUtil.SpecMixin


class PairSpec extends SpecMixin {
  "Pair" must {
    "have .one and .two" in {
      val pair = Pair[String, Int]("hi", 2)
      // pair: Pair[String,Int] = Pair(hi,2)

      pair.one shouldBe "hi"
      // res: String = hi

      pair.two shouldBe 2
      // res: Int = 2

    }
  }
}
