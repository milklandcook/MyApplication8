package com.example.smart_00.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {
    TextView re_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        setTitle("전송된 데이터 결과화면");

        //id 찾기
        re_name=(TextView) findViewById(R.id.re_name);

        //intent 받기
        Intent it = getIntent();

        String str_name1=it.getStringExtra("it_name");

        re_name.setText(str_name1);
    }

}
