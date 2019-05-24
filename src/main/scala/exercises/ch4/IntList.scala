package exercises.ch4

sealed trait IntList {
  def length: Int = this match {
    case End => 0
    case Pair(_, t) => 1 + t.length
  }
}

final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList
