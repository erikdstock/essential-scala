package exercises.ch4

sealed trait IntList {
  def length: Int = this match {
    case End => 0
    case Pair(h, t) => 1 + t.length
  }
}

case class Pair(head: Int, tail: IntList) extends IntList

case object End extends IntList
