package com.skooby.fakewechat;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by skooby on 16/7/2.
 */
public class ProfileFragment extends Fragment {

    public ProfileFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fg_content,container,false);
        TextView textView=(TextView)view.findViewById(R.id.text_content);
        textView.setText("我Fragment");
        return view;
    }
}

