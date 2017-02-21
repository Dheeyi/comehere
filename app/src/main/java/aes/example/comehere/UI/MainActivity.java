package aes.example.comehere.UI;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import aes.example.comehere.R;
import aes.example.comehere.UI.Fragments.MainBankFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBar actionBar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setNavegationDrawer();
    }

    /**
     * Setup Navegation Drawer Content
     * @param navigationView
     */
    private void setupNavigationDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.item_navigation_drawer_home:
                                setTitle(R.string.home);
                                menuItem.setChecked(true);
                                break;
                            case R.id.item_navigation_drawer_book:
                                setTitle(R.string.lastquery);
                                menuItem.setChecked(true);
                                break;
                            case R.id.item_navigation_drawer_book2:
                                setTitle(R.string.history);
                                menuItem.setChecked(true);
                                break;
                            case R.id.item_navigation_drawer_mymaps:
                                setTitle(R.string.maps);
                                menuItem.setChecked(true);
                                break;
                            case R.id.item_navigation_drawer_settings:
                                break;
                            case R.id.item_navigation_drawer_help:
                                break;
                            case R.id.item_navigation_drawer_about:
                                break;
                        }
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    }
                });
    }

    /**
     * Set toolbar
     */
    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);
        changeFragment(new MainBankFragment(), "main");
    }

    /**
     * Set Navegation Drawer
     */
    public void setNavegationDrawer() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);

        if (navigationView != null) {
            setupNavigationDrawerContent(navigationView);
        }
    }

    /**
     * Set Title Toolbar
     * @param title
     */
    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    /**
     * Changes fragments
     * @param fragment
     * @param tag
     */
    public void changeFragment(Fragment fragment, String tag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.contentMain, fragment, tag)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
