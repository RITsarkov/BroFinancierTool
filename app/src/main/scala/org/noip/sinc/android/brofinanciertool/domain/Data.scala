package org.noip.sinc.android.brofinanciertool.domain

trait Data {
  def groups: Seq[Group]

  def groupNames = groups map (_.name) toArray

  def groupMemberNames(group: Group) = group.members map (_.name) toArray
}
