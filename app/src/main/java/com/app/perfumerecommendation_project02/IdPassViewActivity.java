package com.app.perfumerecommendation_project02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IdPassViewActivity extends AppCompatActivity {

    private TextView tv_id, tv_pass;
    private Button btn_check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idpassview);

        tv_id=findViewById(R.id.tv_id);
        tv_pass=findViewById(R.id.tv_pass);
        btn_check = findViewById(R.id.btn_check);

        //확인했습니다 버튼을 누를 시 시행됨
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IdPassViewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        String userID=intent.getStringExtra("userID");
        String userPass=intent.getStringExtra("userPass");

        tv_id.setText(userID);
        tv_pass.setText(userPass);
    }

}