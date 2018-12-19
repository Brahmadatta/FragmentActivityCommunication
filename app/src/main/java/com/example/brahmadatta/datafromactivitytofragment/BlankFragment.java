package com.example.brahmadatta.datafromactivitytofragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment extends Fragment{

    TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        textview = view.findViewById(R.id.textview);

        ((MainActivity)getActivity()).passVal(new PassVal() {
            @Override
            public void passData(String name) {
                textview.setText(name);
            }
        });

        return view;
    }

    /*@Override
    public void passData(String name) {

        textview.setText(name);
    }*/
}
