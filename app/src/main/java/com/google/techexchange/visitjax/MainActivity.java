package com.google.techexchange.visitjax;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdapter myAdapter;
    private DrawerLayout mDrawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myAdapter = new SlideAdapter(this);
 //       viewPager.setAdapter(myAdapter);

//        // make menu clickable
        mDrawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(
        new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                // set item as selected to persist highlight
                menuItem.setChecked(true);
//                // close drawer when item is tapped
//                mDrawerLayout.closeDrawers();

                // Add code here to update the UI based on the item selected
                // For example, swap UI fragments here


                Button home = findViewById(R.id.homePage);
                home.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        //step 3
                        //what do you want to do when the button is clicked?
                        // call function to change activity
                        toHome();
                    }
                });
                //jax beach button
                Button beach = findViewById(R.id.beach);
                beach.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        //step 3
                        //what do you want to do when the button is clicked?
                        // call function to change activity
                        toBeach();
                    }
                });





//                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    private void toHome(){
        //step 4
        //create an intent for the next activity
        Intent a = new Intent(this,MainActivity.class);

        //step 5
        //start the intent you just made
        startActivity(a);

    }

    private void toBeach(){
        //step 4
        //create an intent for the next activity
        Intent a = new Intent(this,BeachActivity.class);

        //step 5
        //start the intent you just made
        startActivity(a);

    }



}


