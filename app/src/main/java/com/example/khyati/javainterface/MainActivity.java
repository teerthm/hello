package com.example.khyati.javainterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.*;


public class MainActivity extends AppCompatActivity {

    //Declaring "non-literal" String for ln 24

    public static String log_IN = "Log In";
    public static int base_id = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout TM = new RelativeLayout(this);
        TM.setBackgroundColor(Color.RED);


        //Button Init

        Button Redbutton = new Button(this);
        Redbutton.setText(log_IN);

        Redbutton.setId(base_id + 1);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Username Init

        EditText Username = new EditText(this);
        Username.setId(base_id + 2);
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        usernameDetails.addRule(RelativeLayout.ABOVE, Redbutton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0, 0, 0, 50);
        Username.setBackgroundColor(Color.YELLOW);




        TM.addView(Redbutton, buttonDetails);
        TM.addView(Username, usernameDetails);
        setContentView(TM);


    }
}
