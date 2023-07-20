package com.example.hello2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
/*
 *
 *  이 MainActivity는 hello2앱이 launch(실행) 될 때
 *  최초로 사용자를 대면하는 Activity이다.
 *  대체로 Activity하는 화면 하나이다.
 *
 */

public class MainActivity extends AppCompatActivity {
    //Activity가 활성화 될 때 최초로 호출되는 메서드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //버튼을 클릭했을 때 호출되는 메서드(View 객체의 참조값이 매개 변수에 전달된다.
    public void clicked(View v){
        Toast.makeText(this, "누른거임?",Toast.LENGTH_SHORT).show();
    }

    public void deleteClicked(View v){
        Toast.makeText(this, "진짜 삭제한다", Toast.LENGTH_SHORT).show();
    }
}