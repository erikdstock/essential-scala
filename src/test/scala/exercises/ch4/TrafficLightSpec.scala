package exercises.ch4

import exercises.TestUtil.SpecMixin
import org.scalatest.{FunSpec, Matchers}


class TrafficLightWordSpec extends SpecMixin {
  // FunSpec style
  "TrafficLight" should {
    "advance to next light" when {
      "red" must {
        "turn green" in {
          Red.next shouldBe Green
        }
      }
      "yellow" must {
        "turn red" in {
          Yellow.next shouldBe Red
        }
      }
      "greenb" must {
        "turn yellow" in {
          Green.next shouldBe Yellow
        }
      }
    }

  }
}

class TrafficLightFunSpec extends FunSpec with Matchers {
  describe("TrafficLight") {
    describe("next") {
      it("red turns green") {
        assert(Red.next == Green) // assert: Scala std library
//        assertResult(Green)(Yellow.next) // or { Yellow.next } uncomment to see failure with expectation as below
      }
      it("yellow turns red") {
        Yellow.next shouldBe Red // shouldBe: from Matchers
      }
      it("green turns yellow") {
        Green.next.shouldBe(Yellow)
      }


    }
  }

}

/*
Output:

[info] TrafficLightSpec:
[info] TrafficLight
[info]   should advance to next light
[info]     when red
[info]     - must turn green
[info]     when yellow
[info]     - must turn red
[info]     when greenb
[info]     - must turn yellow
[info] TrafficLightFunSpec:
[info] TrafficLight
[info]   next
[info]   - red turns green *** FAILED ***
[info]     Expected Green, but got Red (TrafficLightSpec.scala:36)
[info]   - yellow turns red
[info]   - green turns yellow
[info] Run completed in 193 milliseconds.
[info] Total number of tests run: 6
[info] Suites: completed 2, aborted 0
[info] Tests: succeeded 5, failed 1, canceled 0, ignored 0, pending 0
[info] *** 1 TEST FAILED ***
[error] Failed tests:
[error] 	exercises.ch4.TrafficLightFunSpec
[error] (Test / test) sbt.TestsFailedException: Tests unsuccessful

 */