package com.example.try3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class carpma extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma);
        editText=(EditText)findViewById(R.id.ed1);
        button=(Button)findViewById(R.id.bt1);
        textView=(TextView)findViewById(R.id.tv2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String number=editText.getText().toString();
                int n=Integer.parseInt(number);
                result="";
                for (int i=1;i<=10;i++){
                    result+=n+" "+"*"+i+" "+"="+" "+n*i+"\n";
                    textView.setText(result);
                }
            }
        });
        ImageButton imageButton6 = findViewById(R.id.carpmaback);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(carpma.this, learningmenu.class);
                startActivity(intent);
            }
        });
    }
}