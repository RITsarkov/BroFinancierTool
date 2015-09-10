package org.noip.sinc.android.brofinanciertool.app

import org.noip.sinc.android.brofinanciertool.domain.context.AppContext
import org.scaloid.common._

class MainActivity extends SActivity with AppContext {
  onCreate {
    contentView = new SFrameLayout {
      SListView() adapter SArrayAdapter(data.groupNames) onItemClick toast("Hello")
    }
  }
}