package com.example.my04_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgv1 , imgv2 , imgv3;
    int index = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv1 = findViewById(R.id.img_1);
        imgv2 = findViewById(R.id.img_2);
        imgv3 = findViewById(R.id.img_3);
        imgViewGone();
        imgv2.setVisibility(View.VISIBLE);
        //버튼 이벤트
       findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index==1){
                    imgViewGone();
                    imgv1.setVisibility(View.VISIBLE);
                    index=0;
                }
                else if (index==2){
                    imgViewGone();
                    imgv2.setVisibility(View.VISIBLE);
                    index=1;
                }
            }
        });



        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index==0){
                    imgViewGone();
                    imgv2.setVisibility(View.VISIBLE);
                    index=1;
                }
                else if (index==1){
                    imgViewGone();
                    imgv3.setVisibility(View.VISIBLE);
                    index=2;
                }
            }
        });
    }//oncreate
    //이 메서드를 호출하면 GONE
    private void imgViewGone(){
        imgv1.setVisibility(View.GONE);
        imgv2.setVisibility(View.GONE);
        imgv3.setVisibility(View.GONE);
    }
}