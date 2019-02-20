package com.yscall.ndksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView jniText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jniText = findViewById(R.id.jni_text);
        findViewById(R.id.execute).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jniText.setText(JNIUtils.getHelloString());
            }
        });
    }
}
