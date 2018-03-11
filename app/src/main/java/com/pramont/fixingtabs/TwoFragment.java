package com.pramont.fixingtabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {


    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Status Two","OnCreate");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Status Two","OnStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Status Two","OnResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Status Two","OnPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Status Two","OnStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Status Two","OnDestroy");
    }
}
