package exercises

import scala.annotation.tailrec

//
//Here are the main points I picked out of this chapter and a few choice exercises. The meat of the chapter is in 4.5-6:
//`4.{1-5}`: Sum types (`A` *is a* `B` *and* `C` *is a* `B`) and
//Product Types (`X(person: Person)` *has a* `Person`)
//- Understanding of polymorphism as it applies here
//- `4.5.2`: Structural Recursion & pattern matching
//- `4.5.{4-5}` Strategy talk might be good for discussion
//
//*Exercises*
//- `4.5.6.{1-2}`
//- `4.6.3.2` (Trees)
//- `4.7.0.2` implement JSON as structured data type - stretch goal, i think this is really poorly defined and difficult. Maybe a good thing to pair on with a partner during the week.

package object ch4 {

//  case object Red extends TrafficLight
//
//  case object Yellow extends TrafficLight
//
//  case object Green extends TrafficLight
//
//  trait TrafficLight {
//    def next: TrafficLight = this match {
//      case Red => Green
//      case Green => Yellow
//      case Yellow => Red
//    }
//  }
}
