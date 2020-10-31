package com.dev.water_query.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.dev.water_query.R;
import com.dev.water_query.utils.SharedPreferencesUtil;
import com.squareup.picasso.Picasso;

/**
 * @description: 个人信息界面
 * @date 2020/10/19 10:47
 */

public class PersonalFragment extends Fragment {

    //View
    private View mRootView;
    private TextView mPersonalSupplyNumber;
    private ImageView mProfilePhoto;

    public static Fragment newInstance() {
        return new PersonalFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.personal_fragment, container, false);
        initView();
        return mRootView;
    }

    //初始化视图
    private void initView() {
//        mPersonalSupplyNumber = mRootView.findViewById(R.id.personal_supply_number);
//        mProfilePhoto = mRootView.findViewById(R.id.profile_photo);
//
//        mPersonalSupplyNumber.setText(SharedPreferencesUtil.getSupplyNumber(getActivity()).toString());
//        Picasso.with(getContext()).load(R.drawable.qwe).into(mProfilePhoto);
    }

}