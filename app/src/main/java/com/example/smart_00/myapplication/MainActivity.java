package com.example.smart_00.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("고객정보입력화면");

        //id찾기
        edit1 = (EditText) findViewById(R.id.edit1);
        btn1 = (Button) findViewById(R.id.btn1);

        //기능 부여
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_name = edit1.getText().toString();

                Intent it = new Intent(getApplicationContext(), ReceiveActivity.class);
                it.putExtra("it_name", str_name); //변수명=값;
                startActivity(it);
                finish();

            }
        });
    }
}