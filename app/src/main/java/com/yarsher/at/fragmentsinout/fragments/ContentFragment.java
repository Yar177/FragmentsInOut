package com.yarsher.at.fragmentsinout.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yarsher.at.fragmentsinout.R;

public class ContentFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentFragment = inflater.inflate(R.layout.content_fragment, container, false);
        return contentFragment;
    }
}
