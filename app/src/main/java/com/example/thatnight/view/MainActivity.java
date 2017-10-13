package com.example.thatnight.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thatnight.view.view.WaveView;

public class MainActivity extends AppCompatActivity {

    private WaveView mWaveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWaveView = (WaveView) findViewById(R.id.wv);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (mWaveView.isInit()) {
                        mWaveView.start();
                        break;
                    }
                }
            }
        }).start();
    }
}
