// 3.1.6

// 1 Define cats
class Cat(val name: String, val colour: String, val food: String) {
  override def toString = s"A $colour Cat named $name who likes $food"
}

val os = new Cat("Oswald", "Black", "milk")
val he = new Cat("Henderson", "Ginger", "Chips")
val qu = new Cat("Quentin", "Tabby and White", "Curry")

// 2 Define a ChipShop that will only serve cats that love chips
object ChipShop {
  def willServe(c: Cat) = c.food == "Chips"
}
ChipShop.willServe(he)
ChipShop.willServe(os)

/* 3
Write two classes, Director and Film, with fields and methods as follows:

  Director should contain:
  a field firstName of type String
  a field lastName of type String
  a field yearOfBirth of type Int
  a method called name that accepts no parameters and returns the full name
  Film should contain:
  a field name of type String
  a field yearOfRelease of type Int
  a field imdbRating of type Double
  a field director of type Director
  a method directorsAge that returns the age of the director at the time of release
  a method isDirectedBy that accepts a Director as a parameter and returns a Boolean"


*/
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int){
  def name: String = s"$firstName $lastName"
}

class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director){
  def directorsAge = yearOfRelease - director.yearOfBirth
  def isDirectedBy(d: Director) = director == d
  def copy(name: String = name, yearOfRelease: Int = yearOfRelease, imdbRating: Double = imdbRating, director: Director = director): Film = new Film(name, yearOfRelease, imdbRating, director)
}

val eastwood          = new Director("Clint", "Eastwood", 1930)
val mcTiernan         = new Director("John", "McTiernan", 1951)
val nolan             = new Director("Christopher", "Nolan", 1970)
val someBody          = new Director("Just", "Some Body", 1990)

val memento           = new Film("Memento", 2000, 8.5, nolan)
val darkKnight        = new Film("Dark Knight", 2008, 9.0, nolan)
val inception         = new Film("Inception", 2010, 8.8, nolan)

val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
val outlawJoseyWales  = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
val unforgiven        = new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino        = new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus          = new Film("Invictus", 2009, 7.4, eastwood)

val predator          = new Film("Predator", 1987, 7.9, mcTiernan)
val dieHard           = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

eastwood.yearOfBirth         // should be 1930
dieHard.director.name        // should be "John McTiernan"
invictus.isDirectedBy(nolan) // should be false
invictus.isDirectedBy(eastwood) // should be true

highPlainsDrifter.copy(name = "L'homme des hautes plaines")
// returns Film("L'homme des hautes plaines", 1973, 7.7, /* etc */)

thomasCrownAffair.copy(yearOfRelease = 1968,
  director = new Director("Norman", "Jewison", 1926))


/* 4
A Simple counter (construct with Int, inc + dec methods)
5. make increment amount a method

*/
class Counter(val count: Int) {
  def dec: Counter = new Counter(count - 1)
  // overload method params so we don't have to call with .()
  def dec(amount: Int): Counter = new Counter(count - amount)
  def inc: Counter = new Counter(count + 1)
  def inc(amount:Int): Counter = new Counter(count + amount)
}


new Counter(10).inc.dec.inc.inc(3).count
