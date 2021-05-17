package sg.edu.rp.c346.id20039529.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatePicker dp;
        TimePicker tp;
        Button btnDisplayDate;
        Button btnDisplayTime;
        TextView tvDisplay;
        Button btnReset;

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);



        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String message = "Time is ";
            int hour = tp.getCurrentHour();
            int minute = tp.getCurrentMinute();

            if (minute < 10) {
                message += hour + ":0" + minute;
            }else {
                message += hour + ":" + minute;
            }
            tvDisplay.setText(message);
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Date is ";
                int day = dp.getDayOfMonth();
                int month = dp.getMonth() + 1;
                int year = dp.getYear();
                message += day + "/" + month + "/" + year;
                tvDisplay.setText(message);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int resetHour = 0;
            int resetMinute = 0;
            tp.setCurrentHour(resetHour);
            tp.setCurrentMinute(resetMinute);
            dp.updateDate(2021,0,1);

            }
        });


    }


}