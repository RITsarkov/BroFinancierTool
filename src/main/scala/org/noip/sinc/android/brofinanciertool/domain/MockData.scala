package org.noip.sinc.android.brofinanciertool.domain

object MockData extends Data {
  val roma = Person("Roma")
  val oleg = Person("Oleg")
  val alex = Person("Alex")
  val wowBand = Party(name = "Wow band", members = Seq(roma, oleg, alex))

  def parties: Seq[Party] = Seq(wowBand)
}

