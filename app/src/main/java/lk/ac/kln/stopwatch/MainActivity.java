package lk.ac.kln.stopwatch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private Chronometer stopWatch;
    private boolean running;
    private long pauseTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stopWatch=findViewById(R.id.chro);
        stopWatch.setFormat("Time:  %s");

        stopWatch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if((SystemClock.elapsedRealtime()-stopWatch.getBase()) >=10000){
                    stopWatch.setBase(SystemClock.elapsedRealtime());
                }

            }
        });


        }//OnCreate

    public void Start(View v){
        if(!running){ 
            stopWatch.setBase(SystemClock.elapsedRealtime()- pauseTime);
            stopWatch.start();
            running=true;
        }


    }
    public void Pause(View v){
        if(running){
            pauseTime=SystemClock.elapsedRealtime()- stopWatch.getBase();
            stopWatch.stop();
            running=false;

        }


    }
    public void Reset(View v){
        stopWatch.setBase(SystemClock.elapsedRealtime());
        pauseTime=0;




    }






}//class