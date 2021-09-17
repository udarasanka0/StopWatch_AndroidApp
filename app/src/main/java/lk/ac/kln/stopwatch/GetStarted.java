package lk.ac.kln.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {
    Button startbtn;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        startbtn=findViewById(R.id.btn1);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencalculator();
            }
        });




    }//onCreate

    public void opencalculator(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}//class