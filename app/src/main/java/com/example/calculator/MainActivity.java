package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button one,two,three,four,five,six,seven,eight,nine,zero,add,subs,mul,div,btn_dot,btn_clr,btn_equal;
EditText edt1;
Boolean Add,Sub,Mul,Div;
Float res1,res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one= findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four= findViewById(R.id.four);
        five=findViewById(R.id.five);
        six= findViewById(R.id.six);
        seven= findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine= findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        add=findViewById(R.id.add);
        subs=findViewById(R.id.subs);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        btn_dot=findViewById(R.id.btn_dot);
        btn_clr=findViewById(R.id.btn_clr);
        btn_equal=findViewById(R.id.btn_equal);
        edt1= findViewById(R.id.edt1);
        one.setOnClickListener(view -> edt1.setText(edt1.getText()+"1"));
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() +"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1==null)
                    edt1.setText("");
                else{
                    res1=Float.parseFloat(edt1.getText()+"");
                    Add=true;
                    edt1.setText(null);
                }
            }
        });
        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1==null)
                    edt1.setText("");
                else{
                    res1=Float.parseFloat(edt1.getText() +"");
                    Sub=true;
                    edt1.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1==null)
                    edt1.setText("");
                else{
                    res1=Float.parseFloat(edt1.getText() +"");
                    Mul=true;
                    edt1.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1==null)
                    edt1.setText("");
                else{
                    res1=Float.parseFloat(edt1.getText() +"");
                    Div=true;
                    edt1.setText(null);
                }
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2=Float.parseFloat(edt1.getText()+"");
                if(Add==true){
                    edt1.setText(res1+res2 +"");
                    Add=false;
                }else if(Sub==true){
                    edt1.setText(res1-res2+"");
                    Sub=false;
                }
                else if(Mul==  true){
                    edt1.setText(res1*res2+"");
                    Mul=false;
                }
                else if(Div==  true){
                    edt1.setText(res1/res2+"");
                    Div=false;
                }
            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(" ");
            }
        });







    }
}