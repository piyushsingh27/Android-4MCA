package com.example.dashboard.lab3checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // is the view now checked
        boolean checked = ((CheckBox) view).isChecked();


        //Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_burger:
                if (checked) {
                    Toast.makeText(MainActivity.this, "Burger Selected", Toast.LENGTH_LONG).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Burger Deselected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkbox_fries:
                if (checked) {
                    Toast.makeText(MainActivity.this, "Fries Selected", Toast.LENGTH_LONG).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Fries Deselected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkbox_coke:
                if (checked) {
                    Toast.makeText(MainActivity.this, "Coke Selected", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Coke Deselected", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
