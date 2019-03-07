package com.yarsher.at.fragmentsinout;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yarsher.at.fragmentsinout.fragments.FragmentSender;
import com.yarsher.at.fragmentsinout.fragments.ReceiverFragment;

public class FragemntFragmentCommunication extends AppCompatActivity implements FragmentSender.OnFragmentMassageListener {

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

    @Override
    public void onMassageSent(String message) {

        ReceiverFragment receiverFragment = new ReceiverFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        receiverFragment.setArguments(bundle);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentMessageReciver, receiverFragment, null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
}
