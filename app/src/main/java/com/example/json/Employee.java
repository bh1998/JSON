package com.example.json;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;

    public Employee(String firstName, int age, String mail){
        mFirstName = firstName;
        mAge = age;
        mMail = mail;
    }
}
