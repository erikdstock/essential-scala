package exercises.ch5

import exercises.TestUtil.SpecMixin

class SumSpec extends SpecMixin {
  "Sum" must{
    "be a Left or Right" in {

      Left[Int, String](1).value shouldBe 1

      Right[Int, String]("foo").value shouldBe "foo"

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
