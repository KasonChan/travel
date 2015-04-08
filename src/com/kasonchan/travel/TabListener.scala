package com.kasonchan.travel

import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar;

class TabListener(newfragment: Fragment) extends ActionBar.TabListener {

  private var fragment: Fragment = newfragment

  // When a tab is tapped, replace with specified fragment
  // that's why we declared an id for the main layout.
  override def onTabSelected(tab: Tab, ft: FragmentTransaction) {
    ft.replace(R.id.activity_main, fragment)
  }

  // When a tab is unselected, hide the fragment from the user's view. 
  override def onTabUnselected(tab: Tab, ft: FragmentTransaction) = {
    ft.remove(fragment);
  }

  override def onTabReselected(tab: Tab, ft: FragmentTransaction) = {
  }
}
