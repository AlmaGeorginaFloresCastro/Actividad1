package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText x1,x2,y1,y2;
    private TextView pen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        x1=findViewById(R.id.x1);
        x2=findViewById(R.id.x2);
        y1=findViewById(R.id.y1);
        y2=findViewById(R.id.y2);
        pen=findViewById(R.id.pen);

    }
    public void general(View view){
        String a1=x1.getText().toString();
        String a2=x2.getText().toString();
        String b1=y1.getText().toString();
        String b2=y2.getText().toString();
        float num1=Integer.parseInt(a1);
        float num2=Integer.parseInt(a2);
        float num3=Integer.parseInt(b1);
        float num4=Integer.parseInt(b2);



        float pend= (float) (num4-num3)/(num2-num1);
        String r2=String.valueOf(pend);
        pen.setText(r2);


    }
}