package uk.ac.qub.bookshop;
import android.support.v7.app.ActionBarActivity;

import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class mainactivity Activity
public class Sales extends ActionBarActivity { /* When using Appcombat support library
                                                         you need to extend Main Activity to
                                                         ActionBarActivity.
                                                      */


    private Toolbar toolbar;                              // Declaring the Toolbar Object


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        toolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);                   // Setting toolbar as the ActionBar with setSupportActionBar() call
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
// If it in menu folder then use R.menu.main and if it in layout then use R.menu.main

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    //add logic here for retrieving item ID
    public int itemID()
    { return this.itemID();
    }

    // array list for basket
    public int[](itemID itemID) {

    }

    public float itemPrice() {
        return this.itemPrice();
    }

    public float basketBalance(){
        if (basket == null) {
            return 0;}
        else return this.basketBalance()+ (this.itemPrice * this.quantity);
        }
    }
        //check for decimal point placement
        /*
        Cumulative Value to represent basket total
         */
}

public book ()

    public int quantity()
    {}

public void addItem (this.itemID){
        // insert logic for adding this .item ID to basket
        }

public void removeItem (this.itemID){
        // insert logic for removing item from basket
        }