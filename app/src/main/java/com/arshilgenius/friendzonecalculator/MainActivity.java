package com.arshilgenius.friendzonecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int friendZone = 0;
    String No = "Bach Gaye Aap :)  ";
    String Yup = "FriendZoned Hogye Aap LOL";
    String tryAgain = "Best of Luck Arshil ki taraf se";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View v) {
        friendZone = friendZone + 1;

    }

    public void decrement(View v) {
        friendZone = friendZone - 1;
    }

    public void submit(View v) {
        if (friendZone > 3)
            displayYup();
        else
            displayNo();
    }

    public void reset(View v) {
        friendZone = 0;
        displayreset();

    }

    public void displayYup() {
        TextView textview = (TextView) findViewById(R.id.result);
        textview.setText(String.valueOf(Yup));
    }

    public void displayreset() {
        TextView textview = (TextView) findViewById(R.id.result);
        textview.setText(String.valueOf(tryAgain));
    }

    public void displayNo() {
        TextView textview = (TextView) findViewById(R.id.result);
        textview.setText(String.valueOf(No));
    }
}
