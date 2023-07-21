package com.example.step03customadapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //DetailActivity가 활성화 되기 위해서 전달된 Intent객체의 참조값 얻어내기
        Intent intent = getIntent();
        //"dto"라는 키 값으로 담긴 Serializable type의 참조값을 얻어내서 CountryDto type으로 casting
        CountryDto dto = (CountryDto) intent.getSerializableExtra("dto");

        //선택된 cell에 해당하는 CountryDto를 얻어낼 수만 있다면

        //아래의 ImageView와 TextView에 해당 정보를 출력할 수 있다.
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(dto.getResId());

        TextView textView = findViewById(R.id.textView);
        textView.setText(dto.getContent());

        //확인 버튼을 눌렀을 때 Activity 종료 시키기
        Button confirmBtn = findViewById(R.id.confirmBtn);
        confirmBtn.setOnClickListener(view -> {
            //finish()메서드를 호출하면 Activity가 종료
            finish();
        });

    }
}