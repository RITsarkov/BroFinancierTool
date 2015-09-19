package org.noip.sinc.android.brofinanciertool.domain

import org.junit.runner.RunWith
import org.noip.sinc.android.brofinanciertool.domain.MockData._
import org.noip.sinc.android.brofinanciertool.domain.Operations.transfer
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DataTest extends FlatSpec with Matchers {

  "Operations" should "transfer from different balances" in {
    a [IllegalArgumentException] should be thrownBy {
      transfer(Balance(roma), Balance(roma), 10)
    }
  }

}
