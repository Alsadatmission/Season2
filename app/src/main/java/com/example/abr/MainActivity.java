package com.example.abr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Confirm Exit")
                .setMessage("Do u really want to exit")
                .setIcon(R.drawable.bird)
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finishAndRemoveTask();
                    }
                })
                .show();
    }

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