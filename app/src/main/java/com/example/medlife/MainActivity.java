package com.example.medlife;

import android.content.Intent;
import android.os.Bundle;

import com.example.medlife.data.MyDbHandler;
import com.example.medlife.model.App;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.medlife.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    //To redirect on register page
    public void register(View view)
    {
        Intent intent=new Intent(this,Registeration.class);
        startActivity(intent);
    }
    //to redirect to dashboard
    public void loginnow(View view)
    {
        Intent intent=new Intent(this,Dashboard.class);
        EditText editText1=findViewById(R.id.editTextTextPersonName2);
        EditText editText2=findViewById(R.id.editTextTextPassword);
        startActivity(intent);
    }
    public void registerNow(View view)
    {

    }
    public void Confirm1(View view)
    {

    }
    public void Record(View view)
    {

    }
    public void Appointment(View view)
    {

    }
    public void Prescription(View view)
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.medlife.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.coordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        MyDbHandler db=new MyDbHandler(MainActivity.this);

        App sumer=new App();
        sumer.setName("Sumer");
        sumer.setAge(19);
        sumer.setCity("Pusad");
        sumer.setPhone("9011974422");
        sumer.setPass("root");

        db.addUser(sumer);
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

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}