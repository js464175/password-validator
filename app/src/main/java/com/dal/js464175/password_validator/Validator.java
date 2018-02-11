package com.dal.js464175.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.regex.*;

public class Validator extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    protected static boolean validatePassword(String pass) {

        if (pass.length() < 8) {
            return false;
        }
        if (pass.toLowerCase().matches("password")) {
           return false;
        }
        return true;

    }
}
