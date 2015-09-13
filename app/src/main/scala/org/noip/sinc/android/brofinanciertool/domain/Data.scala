package org.noip.sinc.android.brofinanciertool.domain

trait Data {
  def parties: Seq[Party]

  def partyNames: Array[String] = (parties map (_.name)).toArray

  def partyMemberNames(party: Party): Array[String] = (party.members map (_.name)).toArray

  def partiesByName: Map[String, Party] = (partyNames zip parties).toMap
}
