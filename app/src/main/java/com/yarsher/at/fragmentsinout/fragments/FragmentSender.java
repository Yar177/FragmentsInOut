package com.yarsher.at.fragmentsinout.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.yarsher.at.fragmentsinout.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSender extends Fragment {

    OnFragmentMassageListener onFragmentMassageListener;
    Button button;
    EditText editText;

    public interface OnFragmentMassageListener{
        public void onMassageSent(String message);
    }

    public FragmentSender() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_sender, container, false);
        editText = view.findViewById(R.id.tvMessageFromFragment);
        button = view.findViewById(R.id.btnFragmentMessageSend);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                onFragmentMassageListener.onMassageSent(message);

            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            onFragmentMassageListener = (OnFragmentMassageListener) activity;
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        editText.setText("");

    }
}
