package com.example.step01activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //카운트를 셀 필드
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //리셋 버튼을 클릭했을 때 실행되는 메서드
    public void resetClicked(View v){
        count=0;
        /*
         *  현재 활성화 되어 있는 액티비티가 구성한 화면에서
         *  textView라는 아이디를 가지고 있는 UI의 참조값을 얻어
         *  TextView type의 a라는 지역 변수에 담기
         */
        TextView a = findViewById(R.id.textView);
        a.setText(Integer.toString(count));
    }
    //버튼을 click했을 때 실행되는 메서드
    public void clicked(View v){
        //필드의 값을 1증가 시키기
        count++;
        //필드의 값을 TextView에 출력하기(res/layout/activity_main.xml문서를 전개해서)
        //거기에서 TextView의 참조값을 얻어와야 한다.
        TextView a = findViewById(R.id.textView);
        a.setText(Integer.toString(count));//Interger인 값을 문자로 만들어서 사용한다.
    }
}