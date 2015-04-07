package com.kasonchan.travel

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

/**
 *
 */
class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
      getFragmentManager().beginTransaction()
        .add(R.id.container, new PlaceholderFragment()).commit();
    }
  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true
  }

  override def onOptionsItemSelected(item: MenuItem): Boolean = {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    val id = item.getItemId()

    if (id == R.id.action_settings) {
      return true;
    }

    super.onOptionsItemSelected(item)
  }

  /**
   * A placeholder fragment containing a simple view.
   */
  private class PlaceholderFragment extends Fragment {

    def PlaceholderFragment() = {
    }

    override def onCreateView(inflater: LayoutInflater, container: ViewGroup,
      savedInstanceState: Bundle): View = {
      val rootView: View = inflater.inflate(R.layout.fragment_main, container, false);
      rootView;
    }
  }
}
