package com.yarsher.at.fragmentsinout;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yarsher.at.fragmentsinout.fragments.SendMessageFragment;

public class FragmentActivityCommunication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);

        if (findViewById(R.id.message_fragment_container) != null){
            if (savedInstanceState != null){
                return;
            }

            SendMessageFragment sendMessageFragment = new SendMessageFragment();

            FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.message_fragment_container, sendMessageFragment, null);

            fragmentTransaction.commit();




        }


    }
}
