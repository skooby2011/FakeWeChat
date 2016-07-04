package com.skooby.fakewechat;

/**
 * Created by skooby on 16/7/5.
 */
public class WeixinList {
    private int icon_img;
    private int icon_num;
    private String weixin_name;
    private String update_time;
    private String weixin_content;

    public WeixinList(){}

    public WeixinList(int icon_img,int icon_num,String weixin_name,String update_time,String weixin_content){
        this.icon_img = icon_img;
        this.icon_num=icon_num;
        this.weixin_name = weixin_name;
        this.update_time = update_time;
        this.weixin_content = weixin_content;
    }

    public int getIcon_img(){
        return icon_img;
    }

    public int getIcon_num(){
        return icon_num;
    }

    public String getWeixin_name(){
        return weixin_name;
    }

    public String getUpdate_time(){
        return update_time;
    }

    public String getWeixin_content(){
        return weixin_content;
    }

    public void setIcon_img(int icon_img){
        this.icon_img = icon_img;
    }

    public void setIcon_num(int icon_num){
        this.icon_num=icon_num;
    }

    public void setWeixin_name(String weixin_name){
        this.weixin_name = weixin_name;
    }

    public void setUpdate_time(String update_time){
        this.update_time=update_time;
    }

    public void setWeixin_content(String weixin_content){
        this.weixin_content=weixin_content;
    }
}
