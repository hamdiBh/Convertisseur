package com.example.hamdi.convertisseur;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    EditText input;
    TextView result;
    Button convertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);
        convertir = (Button) findViewById(R.id.convertir);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String value  = input.getText().toString();
                    final int intValue = Integer.parseInt(value);
                    final double unit=0.6213;

                    double res = intValue * unit;
                    result.setText("result : "+ res);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Verifiez votre saisie",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }



}
