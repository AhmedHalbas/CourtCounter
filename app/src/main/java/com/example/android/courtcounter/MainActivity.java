package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int counterA=0,counterB=0;
    TextView teamAcounter,teamBcounter;
    Button TeamApts3,TeamApts2,TeamAfree,TeamBpts3,TeamBpts2,TeamBfree,Reset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        teamAcounter= findViewById(R.id.teamA_counter_tv);
        teamBcounter= findViewById(R.id.teamB_counter_tv);
        TeamApts3=findViewById(R.id.teamA_pts3_btn);
        TeamApts2=findViewById(R.id.teamA_pts2_btn);
        TeamAfree=findViewById(R.id.teamA_free_btn);
        TeamBpts3=findViewById(R.id.teamB_pts3_btn);
        TeamBpts2=findViewById(R.id.teamB_pts2_btn);
        TeamBfree=findViewById(R.id.teamB_free_btn);
        Reset=findViewById(R.id.reset_btn);


        TeamApts3.setOnClickListener(this);
        TeamApts2.setOnClickListener(this);
        TeamAfree.setOnClickListener(this);
        TeamBpts3.setOnClickListener(this);
        TeamBpts2.setOnClickListener(this);
        TeamBfree.setOnClickListener(this);
        Reset.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.teamA_pts3_btn:
            {
                counterA+=3;
                teamAcounter.setText(String.valueOf(counterA));
                break;
            }

            case R.id.teamA_pts2_btn:
            {
                counterA+=2;
                teamAcounter.setText(String.valueOf(counterA));
                break;
            }

            case R.id.teamA_free_btn:
            {
                counterA+=1;
                teamAcounter.setText(String.valueOf(counterA));
                break;
            }

            case R.id.teamB_pts3_btn:
            {
                counterB+=3;
                teamBcounter.setText(String.valueOf(counterB));
                break;

            }

            case R.id.teamB_pts2_btn:
            {
                counterB+=2;
                teamBcounter.setText(String.valueOf(counterB));
                break;
            }

            case R.id.teamB_free_btn:
            {
                counterB+=1;
                teamBcounter.setText(String.valueOf(counterB));
                break;
            }


            case R.id.reset_btn:
            {
                counterA=0;
                counterB=0;
                teamAcounter.setText(String.valueOf(counterB));
                teamBcounter.setText(String.valueOf(counterB));
                break;
            }






        }


    }
}
