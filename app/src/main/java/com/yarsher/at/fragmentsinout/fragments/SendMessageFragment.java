package com.yarsher.at.fragmentsinout.fragments;


import android.app.Activity;
import android.content.Context;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
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
public class SendMessageFragment extends Fragment {

    private EditText editText;
    private Button button;

    OnMessageSentListener onMessageSentListener;

    public interface OnMessageSentListener{
        public void onMessageSent(String string);
    }


    public SendMessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_send_message, container, false);
        editText = view.findViewById(R.id.tvMessage);
        button = view.findViewById(R.id.btnSendMessage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                onMessageSentListener.onMessageSent(message);
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;
        try {
            onMessageSentListener = (OnMessageSentListener) activity;
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
