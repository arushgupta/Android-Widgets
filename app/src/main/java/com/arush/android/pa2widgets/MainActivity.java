package com.arush.android.pa2widgets;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextNumber;
    EditText editTextPhone;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);

        textView = (TextView) findViewById(R.id.textView);

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

        switch (id) {
            case R.id.action_about:
                Toast.makeText(this, "This App is made by Arush Gupta", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_clear:
                editTextName.setText("");
                editTextNumber.setText("");
                editTextPhone.setText("");
                textView.setText("");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doButton(View view) {
        String s = "Name: " + editTextName.getText().toString() + "\n" +
                   "Number: " + editTextNumber.getText().toString() + "\n" +
                   "Phone: " + editTextPhone.getText().toString();

        textView.setText(s);
    }
}
