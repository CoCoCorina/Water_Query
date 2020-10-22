package com.dev.water_query.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.water_query.R;
import com.dev.water_query.utils.SharedPreferencesUtil;
import com.squareup.picasso.Picasso;

/**
 * @description: 个人信息界面
 * @date 2020/10/19 10:47
 */

public class PersonalFragment extends Fragment {

    private TextView mPersonalSupplyNumber;
    private ImageView mProfilePhoto;

    public static Fragment newInstance() {
        return new PersonalFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.personal_fragment, container, false);

        mPersonalSupplyNumber = rootView.findViewById(R.id.personal_supply_number);
        mProfilePhoto = rootView.findViewById(R.id.profile_photo);

        PersonalInfo();
        return rootView;
    }

    private void PersonalInfo() {
        mPersonalSupplyNumber.setText(SharedPreferencesUtil.getSupplyNumber(getActivity()).toString());
        Picasso.with(getContext()).load(R.drawable.qwe).into(mProfilePhoto);
    }
}