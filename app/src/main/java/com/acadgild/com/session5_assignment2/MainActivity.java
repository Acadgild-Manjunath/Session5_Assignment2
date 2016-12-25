package com.acadgild.com.session5_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int MenuItem_Computer=1,  MenuItem_GamePad=2, MenuItem_Camera=3,
                      MenuItem_Video=4, MenuItem_Email=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuItem computerMenu = menu.add(0,MenuItem_Computer,0,R.string.computer);
        computerMenu.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        MenuItem gamepadMenu = menu.add(0,MenuItem_GamePad,0,R.string.gamepad);
        computerMenu.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        MenuItem cameraMenu = menu.add(0,MenuItem_Camera,0,R.string.camera);
        computerMenu.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        MenuItem videoMenu = menu.add(0,MenuItem_Video,0,R.string.video);
        computerMenu.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        MenuItem emailMenu = menu.add(0,MenuItem_Email,0,R.string.email);
        computerMenu.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_NEVER);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id==MenuItem_Computer)
        {
            Toast.makeText(getApplicationContext(),"You clicked on " +getResources().getString(R.string.computer),Toast.LENGTH_SHORT).show();
        }

       else if(id==MenuItem_GamePad)
        {
            Toast.makeText(getApplicationContext(),"You clicked on " +getResources().getString(R.string.gamepad),Toast.LENGTH_SHORT).show();
        }

       else if(id==MenuItem_Camera)
        {
            Toast.makeText(getApplicationContext(),"You clicked on " +getResources().getString(R.string.camera),Toast.LENGTH_SHORT).show();
        }

        else if(id==MenuItem_Video)
        {
            Toast.makeText(getApplicationContext(),"You clicked on " +getResources().getString(R.string.video),Toast.LENGTH_SHORT).show();
        }

        else if(id==MenuItem_Email)
        {
            Toast.makeText(getApplicationContext(),"You clicked on " +getResources().getString(R.string.email),Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(getApplicationContext(),"You clicked on nothing ",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
