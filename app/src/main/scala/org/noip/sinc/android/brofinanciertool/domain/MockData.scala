package org.noip.sinc.android.brofinanciertool.domain

case class Person(name: String)
case class Party(name: String, members: Seq[Person])

object EmptyParty$ extends Party(name = "Empty party", members = Seq.empty)

object MockData extends Data {
  val roma = Person("Roma")
  val oleg = Person("Oleg")
  var alex = Person("Alex")
  var wowBand = Party(name = "Wow band", members = Seq(roma, oleg, alex))

  def parties: Seq[Party] = Seq(wowBand)
}

