package com.dev.water_query.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.water_query.R;

public class OnlineCustomerServiceFragment extends Fragment {


    public OnlineCustomerServiceFragment() {
    }

    public static Fragment newInstance() {
        return new OnlineCustomerServiceFragment();
    }

    public static OnlineCustomerServiceFragment newInstance(String param1, String param2) {
        OnlineCustomerServiceFragment fragment = new OnlineCustomerServiceFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.online_customer_service_fragment, container, false);
    }
}