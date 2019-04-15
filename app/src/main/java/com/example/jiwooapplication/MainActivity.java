package com.example.jiwooapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this; // 내부적으로 처리
        class Calc{
            int num,res;
            String op;
            public void execute(){
                switch (op){
                    case "+": break;
                    case "-": break;
                    case "*": break;
                    case "/": break;
                    case "=": break;
                }
            }
            int getNum(){return num;}
            void setNum(){this.num=num;}
        }
        final EditText num1 = findViewById(R.id.num1); // R -> res
        final EditText num2 = findViewById(R.id.num2);
        final TextView result = findViewById(R.id.result);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                //sum = int1+int2;
                Calc c = new Calc();
                Log.d(tag:"입력값 : ",msg:"c.getNum()+");
                c.execute();
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                sum = int1-int2;
            }
        });
        findViewById(R.id.mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                sum = int1*int2;
            }
        });
        findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                sum = int1/int2;
            }
        });
        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                sum = int1+int2;
            }
        });


    }
}
