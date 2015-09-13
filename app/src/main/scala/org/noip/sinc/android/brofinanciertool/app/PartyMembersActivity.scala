package org.noip.sinc.android.brofinanciertool.app

import org.noip.sinc.android.brofinanciertool.domain.context.AppContext
import org.scaloid.common._

/**
 * Activity that allow to view party members
 */
class PartyMembersActivity extends SActivity with AppContext {

  lazy val party = data groupsByName {intent map (_.getStringExtra(GroupName)) get}

  onCreate {
    contentView = new SVerticalLayout() {
      STextView(R.string.party_members) textSize 25.sp
      SListView() adapter SArrayAdapter(data groupMemberNames party)
    } padding 16.sp
  }
}
