package com.example.step03customadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //필드
    List<CountryDto> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adapter에 연결할 모델 객체를 생성
        countries = new ArrayList<>();

        //셈플데이터
        countries.add(new CountryDto(R.drawable.austria,
                "오스트리아", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.belgium,
                "벨기에", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.brazil,
                "브라질", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.france,
                "프랑스", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.germany,
                "독일", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.greece,
                "그리스", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.israel,
                "이스라엘", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.italy,
                "이탈리아", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.japan,
                "일본", "그지 같은 나라~"));
        countries.add(new CountryDto(R.drawable.korea,
                "대한민국", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.poland,
                "폴란드", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.spain,
                "스페인", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.usa,
                "미국", "어쩌구.. 저쩌구.."));
        //ListView에 연결할 adapter 객체 생성
       CountryAdapter adapter = new CountryAdapter(this, R.layout.listview_cell, countries);

        //ListView의 참조값을 얻어와서
        ListView listView = findViewById(R.id.listView);
        //adapter 연결
        listView.setAdapter(adapter);
    }
}