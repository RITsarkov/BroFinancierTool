package org.noip.sinc.android.brofinanciertool.domain

import org.noip.sinc.android.brofinanciertool.domain.MockData._
import org.noip.sinc.android.brofinanciertool.domain.Operations.transfer
import org.scalatest._

class DataTest extends FlatSpec with Matchers {

  "Operations" should "transfer from different balances" in {
    a [IllegalArgumentException] should be thrownBy {
      transfer(Balance(roma), Balance(roma), 10)
    }
  }

}
