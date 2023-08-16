package com.example.json;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String JSON_STRING = "{\"employee\":{\"name\":\"aditya\",\"salary\":59000}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.TextView1);

        try {
            JSONObject emp = (new JSONObject(JSON_STRING)).getJSONObject("employee");
            String empname = emp.getString("name");
            int empsalary = emp.getInt("salary");
            String str = "Employee Name: " + empname + "\n" + "Employee Salary: " + empsalary;

            // Set the formatted string in the TextView
            textView.setText(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
}}