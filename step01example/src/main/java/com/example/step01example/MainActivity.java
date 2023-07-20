package com.example.step01example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button sendBtn = findViewById(R.id.sendBtn);
       sendBtn.setOnClickListener(this);

       Button sendBtn2=findViewById(R.id.sendBtn2);
       sendBtn2.setOnClickListener(view -> {

       });

    }


    @Override
    public void onClick(View view) {
        //1.EditText에서 문자열 읽어오기
        EditText editText = findViewById(R.id.editTextText);
        String msg=editText.getText().toString();
        //2.TextView에 출력하기
        TextView textView = findViewById(R.id.textView);
        textView.setText(msg);

    }

}