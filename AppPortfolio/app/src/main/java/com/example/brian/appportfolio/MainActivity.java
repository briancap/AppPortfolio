package com.example.brian.appportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

/***==================================================================================
 *Author: Brian Cap
 * Dev Start: 4/1/2016
 * Dev Comp: 4/2/2016

 *References:
 *  Toasts: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
 *  Coordinator Layout: http://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html
======================================================================================***/
public class MainActivity extends AppCompatActivity {

    Button spotifyStreamer;
    Button scoresApp;
    Button libraryApp;
    Button buildItBigger;
    Button xyzReader;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.spotifyStreamerMessage, Toast.LENGTH_SHORT).show();
            }
        });

        scoresApp = (Button) findViewById(R.id.scoresApp);
        scoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.scoresAppMessage, Toast.LENGTH_SHORT).show();;
            }
        });

        libraryApp = (Button) findViewById(R.id.libraryApp);
        libraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.libraryAppMessage, Toast.LENGTH_SHORT).show();
            }
        });

        buildItBigger = (Button) findViewById(R.id.buildItBigger);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.buildItBiggerMessage, Toast.LENGTH_SHORT).show();
            }
        });

        xyzReader = (Button) findViewById(R.id.xyzReader);
        xyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.xyzReaderMessage, Toast.LENGTH_SHORT).show();
            }
        });

        capstone = (Button) findViewById(R.id.capstoneApp);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.capstoneAppMessage, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
