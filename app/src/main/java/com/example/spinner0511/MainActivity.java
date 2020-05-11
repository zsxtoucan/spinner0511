package com.example.spinner0511;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner,spinner2;
    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] vice_meal_array = {"咖啡","果汁","汽水"};
        spinner =findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        txtView = findViewById(R.id.txtView);
        ArrayAdapter<String> abc = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,vice_meal_array);
        spinner2.setAdapter(abc);
    }

    public void BtnOK(View view) {
        String main = spinner.getSelectedItem().toString();
        String vice = spinner2.getSelectedItem().toString();
        txtView.setText("主餐:"+main+"\n"+"附餐:"+vice);
    }
}
