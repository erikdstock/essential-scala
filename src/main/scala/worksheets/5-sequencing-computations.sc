//import scala.annotation.tailrec
//
//sealed trait LinkedList[A] {
//  def length: Int =
//    this match {
//      case Pair(_, t) => 1 + t.length
//      case End() => 0
//    }
//
//  def contains(wut: A): Boolean = this match {
//    case Pair(h, t) => if (h == wut) true else t contains wut
//    case End() => false
//
//  }
//
//  def apply(n: Int): A = {
//    @tailrec
//    def go(i: Int = 0, list: LinkedList[A]): A = list match {
//      case Pair(h, t) => {
//        println(i, n, h)
//        if (i == n) h else go(i + 1, t)
//      }
//      case End() => throw new Exception("nth element not found")
//    }
//
//    go(0, this)
//  }
//}
//
//final case class End[B]() extends LinkedList[B]
//
//final case class Pair[B](head: B, tail: LinkedList[B]) extends LinkedList[B]
//
//val example: Pair[Int] = Pair(1, Pair(2, Pair(3, End())))
//assert(example.length == 3)
//assert(example.tail.length == 2)
//
//
//assert(example.contains(3))
//assert(!example.contains(4))
//
//println(example(1))
//println(example(2))
//assert(example(1) == 2)
//assert(example(2) == 3)
