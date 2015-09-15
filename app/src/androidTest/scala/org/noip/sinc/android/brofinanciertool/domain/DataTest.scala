package org.noip.sinc.android.brofinanciertool.domain

import org.junit.runner.RunWith
import org.noip.sinc.android.brofinanciertool.domain.Operations.transfer
import org.scalatest.junit.JUnitRunner
import org.scalatest._
import MockData._

@RunWith(classOf[JUnitRunner])
class DataTest extends FlatSpec with Matchers {

  "Operations" should "transfer from different balances" in {
    a [IllegalArgumentException] should be thrownBy {
      transfer(Balance(roma), Balance(roma), 10)
    }
  }

}
