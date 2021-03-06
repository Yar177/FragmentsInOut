package com.yarsher.at.fragmentsinout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xmlFragmentActivity(View view) {
        Intent intent = new Intent(this, XmlFragment.class);
        startActivity(intent);
    }

    public void runtimeFragmentActivity(View view) {
        Intent intent = new Intent(this, RunTimeFragment.class);
        startActivity(intent);
    }



    public void fragmentActivityCommunication(View view) {
        Intent intent = new Intent(this, FragmentActivityCommunication.class);
        startActivity(intent);
    }

    public void fragmentFragmentCommunication(View view) {
        Intent intent = new Intent(this, FragemntFragmentCommunication.class);
        startActivity(intent);
    }
}
