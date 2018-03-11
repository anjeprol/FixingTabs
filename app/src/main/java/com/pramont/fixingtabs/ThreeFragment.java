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
public class ThreeFragment extends Fragment {


    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Status Three","OnCreate");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Status Three","OnStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Status Three","OnResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Status Three","OnPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Status Three","OnStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Status Three","OnDestroy");
    }

}
