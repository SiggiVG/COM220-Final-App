package com.example.android.com220finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import service_and_storage.Service;
import service_and_storage.User;

public class setup extends AppCompatActivity {

    boolean ImMAle;
    boolean ImFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);




    }

    public void done(View view) {





        //EditText Name = (EditText) findViewById(R.id.etNAME) ;
        //String TNAME = Name.getText().toString();
        EditText hight = (EditText) findViewById(R.id.etHight);
        String shight = hight.getText().toString();
        double HightValue = Double.parseDouble(shight);
        EditText Wight = (EditText) findViewById(R.id.etWidth);
        String sWight = Wight.getText().toString();
        double WightValue = Double.parseDouble(sWight);
        RadioButton M = (RadioButton) findViewById(R.id.rbMale);
        boolean men = M.isChecked();
        RadioButton F = (RadioButton) findViewById(R.id.rbFemale);
        boolean fmen = F.isChecked();
        if (men)
            ImMAle = Boolean.TRUE;
        if (fmen)
            ImFemale = Boolean.TRUE;

        //Service.getInstance().setUserName(TNAME);
        Service.getInstance().setUserWeight(WightValue);
        Service.getInstance().setUserHeight(HightValue);

        if (ImMAle)
            Service.getInstance().setUserGender(User.Gender.Male);
        if (ImFemale)
         Service.getInstance().setUserGender(User.Gender.Female);


        Intent intent = new Intent(setup.this,MainActivity.class);
        startActivity(intent);

    }
}
