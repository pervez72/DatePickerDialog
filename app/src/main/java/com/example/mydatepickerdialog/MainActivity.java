package com.example.mydatepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.Button_textID);
        textView=findViewById(R.id.textviewID);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        DatePicker datePicker=new DatePicker(this);

        int currentday=datePicker.getDayOfMonth();
        int currentMonth=(datePicker.getMonth()+1);
        int currentYear=datePicker.getYear();


   DatePickerDialog =new DatePickerDialog(MainActivity.this,

            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                    textView.setText(dayOfMonth+"/"+(month)+1+"/"+year);

                }
            },currentYear,currentMonth,currentday);

    datePickerDialog.show();



    }
}