package com.example.bmi;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.LongToDoubleFunction;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText edWeight;
    private EditText edHeight;
    private TextView edResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.main_linear);
        findViews();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        edResult = findViewById(R.id.result);
        Button help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("INFO")
                        .setMessage("BMI is DYYTFY")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });
    }

    public void bmi(View view){
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        Float weight = Float.parseFloat(w);
        Float height = Float.parseFloat(h);
        float bmi = weight / (height*height) ;
        Log.d("MainActivity","BMI = "+ bmi);
        Toast.makeText(MainActivity.this, "Your BMI is : "+bmi, Toast.LENGTH_LONG).show();
        edResult.setText("Your BMI is : "+bmi);
/*        new AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage("Your BMI is : "+bmi)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edWeight.setText("");
                        edHeight.setText("");
                        edResult.setText("");
                    }
                })
                .show();*/

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI", bmi);
        startActivity(intent);
    }
}