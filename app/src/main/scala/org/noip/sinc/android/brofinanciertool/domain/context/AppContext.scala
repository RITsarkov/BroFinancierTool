package org.noip.sinc.android.brofinanciertool.domain.context

import org.noip.sinc.android.brofinanciertool.domain.MockData

/**
 * Application context
 */
trait AppContext {
  def data = MockData
}

object AppContext {

}