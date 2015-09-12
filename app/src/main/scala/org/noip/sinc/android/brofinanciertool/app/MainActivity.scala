package org.noip.sinc.android.brofinanciertool.app

import android.view.View
import android.widget.{AdapterView, TextView}
import org.noip.sinc.android.brofinanciertool.domain.context.AppContext
import org.scaloid.common._

class MainActivity extends SActivity with AppContext {
  onCreate {
    contentView = new SVerticalLayout() {
      STextView(R.string.parties) textSize 25.sp
      SListView() adapter SArrayAdapter(data.groupNames) onItemClick listener
    } padding 16.sp
  }

  lazy val listener: (AdapterView[_], View, Int, Long) => Unit = show

  def show(parent: AdapterView[_], view: View, position: Int, id: Long): Unit = {
    SIntent[PartyMembersActivity].put(view.asInstanceOf[TextView].text).start
  }
}