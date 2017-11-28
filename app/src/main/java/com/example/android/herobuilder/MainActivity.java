package com.example.android.herobuilder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /** The main activity for this app acts as a menu to load which character
     *  building module to load.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Pathfinder Button **/
    public void loadPathfinder(View view){
        Intent intent = new Intent(this, PathfinderActivity.class);
        startActivity(intent);
    }
}
