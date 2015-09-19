package org.noip.sinc.android.brofinanciertool.domain

trait Data {
  def parties: Seq[Party]

  def partyNames: Array[String] = (parties map (_.name)).toArray

  def partyMemberNames(party: Party): Array[String] = (party.members map (_.name)).toArray

  def partiesByName: Map[String, Party] = (partyNames zip parties).toMap
}

trait Balance[T] {
  def owner: T
  def amount: Long
}

object Balance {
  def apply(person: Person) = PersonBalance(person, 0)

  def apply(party: Party) = PartyBalance(party, 0)
}

case class Person(name: String)
case class Party(name: String, members: Seq[Person])

case class PersonBalance(owner: Person, amount: Long) extends Balance[Person]
case class PartyBalance(owner: Party, amount: Long) extends Balance[Party]

case class Transaction[T, K](from: Balance[T], to: Balance[K], amount: Long)

