package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*
        Employee employee = new Employee("Bassam", 21, "bassamhashmi7@gmail.com");
        String json = gson.toJson(employee);
        */

        String json = "{\"first_name\":\"Bassam\",\"age\":21,\"mail\":\"bassamhashmi7@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
    }

}