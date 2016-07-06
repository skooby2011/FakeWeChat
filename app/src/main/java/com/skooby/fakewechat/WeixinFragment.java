package com.skooby.fakewechat;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by skooby on 16/7/2.
 */
public class WeixinFragment extends Fragment {

    private FragmentManager fManager;
    private ArrayList<WeixinList> weixinLists;
    private ListView fg_weixin_list;

    public WeixinFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fg_content,container,false);
        fg_weixin_list=(ListView)view.findViewById(R.id.fg_weixin_list);
        weixinLists = new ArrayList<WeixinList>();
        WeixinList luoji = new WeixinList(R.mipmap.luoji_img,6,"逻辑思维","6:30","[语音]");
        WeixinList xiaoy = new WeixinList(R.mipmap.xiaoy,1,"xiaoy","昨天","infi");
        weixinLists.add(luoji);
        weixinLists.add(xiaoy);
        WeixinListAdapter weixinListAdapter = new WeixinListAdapter(weixinLists,getActivity());
        fg_weixin_list.setAdapter(weixinListAdapter);
        return view;
    }
}
