package exercises

import org.scalatest.{Matchers, WordSpec}

/**
  * Some Scalatest docs:
  * http://www.scalatest.org/user_guide/selecting_a_style
  * http://www.scalatest.org/user_guide/using_assertions
  * http://www.scalatest.org/user_guide/using_matchers
  */

object TestUtil {

  trait SpecMixin extends WordSpec with Matchers

}
