package org.noip.sinc.android.brofinanciertool.app

import android.app.Activity
import android.os.Bundle
import android.view.{Menu, MenuItem}

class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override def onCreateOptionsMenu(menu: Menu) = {
    getMenuInflater.inflate(R.menu.menu_main, menu)
    true
  }

  override def onOptionsItemSelected(item: MenuItem) = {
    val id = item.getItemId
    id == R.id.action_settings || super.onOptionsItemSelected(item)
  }
}
