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
    Button button;
    EditText edOne;
    int mul=0;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay=findViewById(R.id.tvDisplay);
        button=findViewById(R.id.button);
        edOne=findViewById(R.id.edOne);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int max=Integer.parseInt(edOne.getText().toString());

                for(int x=1;x<=10;x++){
                    mul=max*x;

                    tvDisplay.append(max +"*"+ x +"=" +mul+"\n");

                }
            }
        });



        
        
        



 

    
    }
}