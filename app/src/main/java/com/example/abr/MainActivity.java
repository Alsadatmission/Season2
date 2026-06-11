package com.example.abr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
   EditText edOne;
   Button button;
   TextToSpeech textToSpeech;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edOne=findViewById(R.id.edOne);
        tvDisplay=findViewById(R.id.tvDisplay);

        button=findViewById(R.id.button);
        textToSpeech= new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });
        
        
        
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Hello How are you",TextToSpeech.QUEUE_FLUSH,null,null);
            }
        });
 

    
    }
}