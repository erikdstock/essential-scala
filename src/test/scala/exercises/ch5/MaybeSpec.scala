package exercises.ch5

import exercises.TestUtil.SpecMixin

class MaybeSpec extends SpecMixin {
  "Maybe" must {
    "be a Full or Empty" in {

    Full[Int](42).get shouldBe 42

    Empty[String]().isEmpty shouldBe true

    val sum: Sum[Int, String] = Right("foo")

    val x = sum match {
      case Left(x) => x.toString
      case Right(x) => x
    }
    x shouldBe "foo"
  }

    "have a .fold" ignore {

    }

  }
}
