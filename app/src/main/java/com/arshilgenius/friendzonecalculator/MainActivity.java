package com.arshilgenius.friendzonecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int friendZone = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int increment(View view) {
        friendZone = friendZone + 1;
        return friendZone;
    }

    public int decrement(View view) {
        friendZone = friendZone - 1;
        return friendZone;
    }

    public void onSubmit(int friendZone) {
        if (friendZone > 3)
            displayYup();
        else displayNo();
    }

    public void displayYup() {
        TextView textview = (TextView) findViewById(R.id.result);
        textview.setText("SHITTTTT !!!! Friendzoned Ho Gaye Aap LOL");
    }

    public void displayNo() {
        TextView textview = (TextView) findViewById(R.id.result);
        textview.setText("Bach Gayee Aap Friendzone nhi hue ");
    }
}
