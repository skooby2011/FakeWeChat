package com.skooby.fakewechat;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.SwipeRefreshLayout;
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
public class WeixinFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

    private FragmentManager fManager;
    private ArrayList<WeixinList> weixinLists;
    private ListView fg_weixin_list;

    private SwipeRefreshLayout mRefreshLayout;

    public WeixinFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fg_weixin_list,container,false);
        fg_weixin_list=(ListView)view.findViewById(R.id.weixin_list);

        mRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_container);
        mRefreshLayout.setOnRefreshListener(this);
        mRefreshLayout.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        weixinLists = new ArrayList<>();
        WeixinList luoji = new WeixinList(R.mipmap.luoji_img,"6","逻辑思维","6:30","[语音]");
        WeixinList xiaoy = new WeixinList(R.mipmap.xiaoy,"1","xiaoy","昨天","infi VS Fly100%");
        WeixinList gongfu = new WeixinList(R.mipmap.gongfu_img,"5","功夫财经","9:00","李大霄：婴儿底抱紧紧");
        weixinLists.add(luoji);
        weixinLists.add(xiaoy);
        weixinLists.add(gongfu);
        WeixinListAdapter weixinListAdapter = new WeixinListAdapter(weixinLists,this.getContext());
        fg_weixin_list.setAdapter(weixinListAdapter);
        return view;
    }

    @Override
    public void onRefresh() {
        mRefreshLayout.setRefreshing(true);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                mRefreshLayout.setRefreshing(false);
            }
        }, 3000);
    }
}
