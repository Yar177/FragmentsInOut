package com.yarsher.at.fragmentsinout.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yarsher.at.fragmentsinout.R;
import com.yarsher.at.fragmentsinout.RunTimeFragment;

public class ContainerFragment extends Fragment {
    Button button;

    public ContainerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_container, container, false);
        button = view.findViewById(R.id.btnMainFragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RunTimeFragment.fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, new FragmentOne(), null)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }

}
