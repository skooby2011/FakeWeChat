package com.skooby.fakewechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by skooby on 16/7/5.
 */
public class WeixinListAdapter extends BaseAdapter {

    private ArrayList<WeixinList> weixinLists;
    private Context myContext;

    public WeixinListAdapter(ArrayList<WeixinList> weixinLists,Context myContext){
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
            viewHolder.icon_num = (TextView)convertView.findViewById(R.id.icon_num);
            viewHolder.weixin_name = (TextView)convertView.findViewById(R.id.weixin_name);
            viewHolder.update_time = (TextView)convertView.findViewById(R.id.update_time);
            viewHolder.weixin_content = (TextView)convertView.findViewById(R.id.weixin_content);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.icon_img.setImageResource(weixinLists.get(position).getIcon_img());
        viewHolder.icon_num.setText(weixinLists.get(position).getIcon_num());
        viewHolder.weixin_name.setText(weixinLists.get(position).getWeixin_name());
        viewHolder.update_time.setText(weixinLists.get(position).getUpdate_time());
        viewHolder.weixin_content.setText(weixinLists.get(position).getWeixin_content());
        return convertView;
    }
    private class ViewHolder{
        ImageView icon_img;
        TextView icon_num;
        TextView weixin_name;
        TextView update_time;
        TextView weixin_content;
    }
}
