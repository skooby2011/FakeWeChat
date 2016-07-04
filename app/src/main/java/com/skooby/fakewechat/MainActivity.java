package com.skooby.fakewechat;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,ViewPager.OnPageChangeListener{

    //UI控件
    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_weixin;
    private RadioButton rb_contact;
    private RadioButton rb_find;
    private RadioButton rb_profile;
    private ViewPager vpager;

    private MyFragmentPagerAdapter mAdapter;

    //各个页的常量
    public static final int  PAGE_ONE =0;
    public static final int  PAGE_TWO =1;
    public static final int  PAGE_THREE =2;
    public static final int  PAGE_FOUR =3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindWiews();
        rb_weixin.setChecked(true);
    }

    private void bindWiews(){
        txt_topbar = (TextView)findViewById(R.id.text_topbar);
        rg_tab_bar =(RadioGroup)findViewById(R.id.tab_bar);
        rb_weixin =(RadioButton)findViewById(R.id.rb_weixin);
        rb_contact=(RadioButton)findViewById(R.id.rb_contact_list);
        rb_find=(RadioButton)findViewById(R.id.rb_find);
        rb_profile=(RadioButton)findViewById(R.id.rb_profile);
        rg_tab_bar.setOnCheckedChangeListener(this);

        vpager=(ViewPager)findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group,int checkedId){
        switch (checkedId){
            case R.id.rb_weixin:
                vpager.setCurrentItem(PAGE_ONE);
                txt_topbar.setText("微信");
                break;
            case R.id.rb_contact_list:
                vpager.setCurrentItem(PAGE_TWO);
                txt_topbar.setText("通讯录");
                break;
            case R.id.rb_find:
                vpager.setCurrentItem(PAGE_THREE);
                txt_topbar.setText("发现");
                break;
            case R.id.rb_profile:
                vpager.setCurrentItem(PAGE_FOUR);
                txt_topbar.setText("我");
                break;
        }
    }

    //重写ViewPager的页面切换方法
    @Override
    public void onPageScrolled(int position,float positionOffset,int positionOffsetPixels){
    }

    @Override
    public void onPageSelected(int position){}

    @Override
    public void onPageScrollStateChanged(int state){
        //state三个状态，0 什么都没做，1 正在滑动，2 滑动完成
        if(state == 2){
            switch (vpager.getCurrentItem()){
                case PAGE_ONE:
                    rb_weixin.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_contact.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_find.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_profile.setChecked(true);
                    break;
            }

        }
    }
}
