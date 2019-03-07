package com.yarsher.at.fragmentsinout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yarsher.at.fragmentsinout.fragments.FragmentSender;

public class FragemntFragmentCommunication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragemnt_fragment_communication);

        if (findViewById(R.id.fragmentMessageReciver) != null){
            if (savedInstanceState != null){
                return;
            }
            FragmentSender fragmentSender = new FragmentSender();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentMessageReciver, fragmentSender, null)
                    .commit();







        }
    }
}
