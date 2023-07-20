package com.example.step01activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //이동 버튼의 참조값 얻어오기
        Button moveBtn = findViewById(R.id.moveBtn);
        //버튼을 눌렀을 때 동작하기 위한 리스너 등록
        moveBtn.setOnClickListener(this);
//        moveBtn.setOnClickListener(view->{
//            Intent intent = new Intent(this, SubActivity.class);
//            startActivity(intent);
       // });
    }

    @Override
    public void onClick(View view) {
    //SubActivitiy를 활성화 시키겠다는 의도(Intent) 객체 생성하기
        Intent intent=new Intent(this, SubActivity.class);
        //startActivity()메서드를 호출하면서 Intent객체를 전달하기
        startActivity(intent);
    }
}