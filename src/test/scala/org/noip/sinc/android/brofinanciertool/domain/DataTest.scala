package org.noip.sinc.android.brofinanciertool.domain

import org.noip.sinc.android.brofinanciertool.domain.MockData._
import org.noip.sinc.android.brofinanciertool.domain.Operations.transfer
import org.scalatest.exceptions.TestFailedException
import org.scalatest._

class DataTest extends FlatSpec with Matchers {

  behavior of "A test"

  it should "be passed" in {
    assert(true)
  }

  it should "be failed" in {
    intercept[TestFailedException] {
      assert(false)
    }
  }

//  "Transfer from different balances" should "" in {
//    a [IllegalArgumentException] should be thrownBy {
//      transfer(Balance(roma), Balance(roma), 10)
//    }
//  }

}
