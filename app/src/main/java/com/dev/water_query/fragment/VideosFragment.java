package com.dev.water_query.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.water_query.R;

public class VideosFragment extends Fragment {
    public static Fragment newInstance() {
        return new VideosFragment();
    }


    public VideosFragment() {
    }

    public static VideosFragment newInstance(String param1, String param2) {
        VideosFragment fragment = new VideosFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.videos_fragment, container, false);
    }
}