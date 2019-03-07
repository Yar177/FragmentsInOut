package com.yarsher.at.fragmentsinout.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yarsher.at.fragmentsinout.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReceiverFragment extends Fragment {

    TextView textView;


    public ReceiverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receiver, container, false);

        textView = view.findViewById(R.id.tvFragmentMessageReceiver);

        Bundle bundle = getArguments();
        String message = bundle.getString("message");
        textView.append("\n" + message);

        return view;
    }

}
