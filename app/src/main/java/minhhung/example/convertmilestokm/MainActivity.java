package minhhung.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonMtoK = (Button) findViewById(R.id.MToK);
        buttonMtoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText MileBox = (EditText) findViewById(R.id.TextMiles);
                EditText KmBox = (EditText) findViewById(R.id.TextKm);
                Double Miles = Double.valueOf(MileBox.getText().toString());
                Double Km = Miles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                KmBox.setText(formatVal.format(Km));
            }
        });

        Button buttonKtoM = (Button) findViewById(R.id.KToM);
        buttonKtoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText MileBox = (EditText) findViewById(R.id.TextMiles);
                EditText KmBox = (EditText) findViewById(R.id.TextKm);
                Double Km = Double.valueOf(KmBox.getText().toString());
                Double Miles = Km*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                MileBox.setText(formatVal.format(Miles));
            }
        });
    }
}