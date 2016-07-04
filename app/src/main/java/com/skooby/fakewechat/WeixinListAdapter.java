package com.skooby.fakewechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by skooby on 16/7/5.
 */
public class WeixinListAdapter extends BaseAdapter {

    private List<WeixinList> weixinLists;
    private Context myContext;

    public WeixinListAdapter(List<WeixinList> weixinLists,Context myContext){
        this.weixinLists = weixinLists;
        this.myContext = myContext;
    }

    @Override
    public int getCount(){
        return weixinLists.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(myContext).inflate(R.layout.weixin_list,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.icon_img = (ImageView)convertView.findViewById(R.id.icon_image);



        }

        private class ViewHolder(){
            ImageView icon_img;


        }

    }


}
