package com.kasonchan.travel

import android.app.Activity
import android.app.ActionBar
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.os.Build

class MainActivity extends Activity {

  val fragmentDateTab = new FragmentDateTab()
  val fragmentDestinationTab = new FragmentDestinationTab()

  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //    Default action bar
    val actionBar: ActionBar = getActionBar()
    actionBar.setDisplayHomeAsUpEnabled(true)

    // Create action bar tabs
    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS)

    // Set custom tab icon
    val date = actionBar.newTab().setIcon(R.drawable.ic_access_time_white_48dp)
    val destination = actionBar.newTab().setIcon(R.drawable.ic_pin_drop_white_48dp)

    // Set tab listeners
    date.setTabListener(new TabListener(fragmentDateTab))
    destination.setTabListener(new TabListener(fragmentDestinationTab))

    //    Add tabs to action bar
    actionBar.addTab(date)
    actionBar.addTab(destination)

  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return super.onCreateOptionsMenu(menu)
  }
}
