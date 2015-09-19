package org.noip.sinc.android.brofinanciertool.app

import org.noip.sinc.android.brofinanciertool.domain.context.AppContext
import org.scaloid.common._

/**
 * Activity that allow to view party members
 */
class PartyMembersActivity extends SActivity with AppContext {

  //todo use ID
  lazy val party = data partiesByName {(intent map (_.getStringExtra(PartyName))).get}

  onCreate {
    contentView = new SVerticalLayout() {
      STextView(R.string.party_members) textSize 25.sp
      SListView() adapter SArrayAdapter(data partyMemberNames party)
    } padding 16.sp
  }
}
