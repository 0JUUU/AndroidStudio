package com.youngju.sentilabmssa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextView_main;
    private int count = 0;
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            count += 1;
            TextView_main.setText(count + "");      // 1초 간격

            if(count < 5) {
                handler.postDelayed(runnable, 1000);            // 1초에 한번씩
            }
            else {
                handler.removeCallbacks(runnable);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView_main = findViewById(R.id.TextView_main);


        // handler (runnable) - 장난 (숫자 1 2 3 4 .... // 5 4 3 2 1 0)
        // Thread 쓰레드 - 하나의 작업공간 = 메인(UI 그린다) ...... 백그라운드 .....

    //    handler.postDelayed(runnable, 0);
        // 지정 : 0 --> 바로 시작, 밑이랑 같은 내용
        handler.post(runnable);

        // 이렇게도 만들어보기 전역 vs 지역의 차이
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        })
    }
}
