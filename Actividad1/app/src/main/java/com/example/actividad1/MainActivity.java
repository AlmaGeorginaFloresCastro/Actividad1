package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2,n3;
    private TextView res1;
    private TextView res2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        n3=findViewById(R.id.n3);
        res1=findViewById(R.id.res1);
        res2=findViewById(R.id.res2);
    }
    public void general(View view){
        String v1=n1.getText().toString();
        String v2=n2.getText().toString();
        String v3=n3.getText().toString();
        float num1=Integer.parseInt(v1);
        float num2=Integer.parseInt(v2);
        float num3=Integer.parseInt(v3);

        double h = Math.pow(num2, 2) - 4 * num1 * num3;

        float g1= (float) ((-(num2)+h)/2*num1);
        String r1=String.valueOf(g1);
        res1.setText(r1);

        float g2= (float) ((-(num2)+h)/2*num1);
        String r2=String.valueOf(g2);
        res2.setText(r2);


    }
}