package org.noip.sinc.android.brofinanciertool.domain.context

import org.noip.sinc.android.brofinanciertool.domain.MockData

/**
 * Application context
 */
trait AppContext {
  val PartyName = "PartyName"

  def data = MockData
}

object AppContext {

}