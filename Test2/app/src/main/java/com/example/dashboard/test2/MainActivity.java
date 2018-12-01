package com.example.dashboard.test2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sum = (Button)findViewById(R.id.sum);
        Button sub = (Button)findViewById(R.id.sub);
        Button mul = (Button)findViewById(R.id.mul);
        Button div = (Button)findViewById(R.id.div);
        Button cle = (Button)findViewById(R.id.cle);

        final EditText fir = (EditText)findViewById(R.id.first);
        final EditText sec = (EditText)findViewById(R.id.second);



        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = fir.getText().toString();
                String s2 = sec.getText().toString();
                if( s.equals("") || s2.equals("") )
                {
                    Toast.makeText(MainActivity.this, "Inputs may be empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (null != MainActivity.this.getCurrentFocus())
                        imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus()
                                .getApplicationWindowToken(), 0);
                    final int x = Integer.parseInt(s);

                    final int y = Integer.parseInt(s2);
                    Toast.makeText(MainActivity.this, "Sum = "+(x+y), Toast.LENGTH_SHORT).show();
                }
            }});

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = fir.getText().toString();
                String s2 = sec.getText().toString();
                if( s.equals("") || s2.equals("") )
                {
                    Toast.makeText(MainActivity.this, "Inputs may be empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (null != MainActivity.this.getCurrentFocus())
                        imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus()
                                .getApplicationWindowToken(), 0);
                    final int x = Integer.parseInt(s);
                    s = sec.getText().toString();
                    final int y = Integer.parseInt(s2);
                    Toast.makeText(MainActivity.this, "Subtract = "+(x-y), Toast.LENGTH_SHORT).show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = fir.getText().toString();
                String s2 = sec.getText().toString();
                if( s.equals("") || s2.equals("") )
                {
                    Toast.makeText(MainActivity.this, "Inputs may be empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (null != MainActivity.this.getCurrentFocus())
                        imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus()
                                .getApplicationWindowToken(), 0);
                    final int x = Integer.parseInt(s);
                    s = sec.getText().toString();
                    final int y = Integer.parseInt(s);
                    Toast.makeText(MainActivity.this, "Multiplication = " + (x * y), Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = fir.getText().toString();
                String s2 = sec.getText().toString();
                if( s.equals("") || s2.equals("") )
                {
                    Toast.makeText(MainActivity.this, "Inputs may be empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (null != MainActivity.this.getCurrentFocus())
                        imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus()
                                .getApplicationWindowToken(), 0);
                    final int x = Integer.parseInt(s);
                    s = sec.getText().toString();
                    final int y = Integer.parseInt(s);
                    Toast.makeText(MainActivity.this, "Div = " + (x / y), Toast.LENGTH_SHORT).show();
                }
            }
        });

        cle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                if (null != MainActivity.this.getCurrentFocus())
                    imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus()
                            .getApplicationWindowToken(), 0);
                fir.setText("");
                sec.setText("");
                fir.requestFocus();
            }
        });
    }


}
