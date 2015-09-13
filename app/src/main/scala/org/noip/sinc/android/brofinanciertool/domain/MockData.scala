package org.noip.sinc.android.brofinanciertool.domain

case class Person(name: String)
case class Group(name: String, members: Seq[Person])

object EmptyGroup extends Group(name = "Empty group", members = Seq.empty)

object MockData extends Data {
  val roma = Person("Roma")
  val oleg = Person("Oleg")
  var alex = Person("Alex")
  var wowBand = Group(name = "Wow band", members = Seq(roma, oleg, alex))

  def groups: Seq[Group] = Seq(wowBand)
}

