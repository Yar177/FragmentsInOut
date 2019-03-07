package com.yarsher.at.fragmentsinout;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RunTimeFragment extends AppCompatActivity {

    private static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_time_fragment);

        if (findViewById(R.id.fragmentContainer) != null){
            if (savedInstanceState != null){
                return;
            }

            fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.add(R.id.fragmentContainer, null);

            fragmentTransaction.commit();
        }


    }//end onCreate


}//end class
