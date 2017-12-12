package com.proje.fatmanur.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        toggleBtn = (ToggleButton) findViewById(R.id.toggleButtonVisibility);

        toggleBtn.setChecked(true);


        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean on = ((ToggleButton) v).isChecked();
                if (on) {
                    // ON durumunda yapılacaklar
                    toggleBtn.setBackgroundResource(R.drawable.play);



                } else {
                    // OFF durumunda yapılacaklar

                    toggleBtn.setBackgroundResource(R.drawable.pause);

                }
            }
        });

    }




}
