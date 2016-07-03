package com.skooby.fakewechat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

/**
 * Created by skooby on 16/7/4.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private WeixinFragment weixinFragment = null;
    private ContactFragment contactFragment = null;
    private FindFragment findFragment =null;
    private ProfileFragment profileFragment = null;

    public MyFragmentPagerAdapter(FragmentManager fm){
        super(fm);
        weixinFragment = new WeixinFragment();
        contactFragment = new ContactFragment();
        findFragment = new FindFragment();
        profileFragment = new ProfileFragment();

    }

    @Override
    public int getCount(){
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg,int position){
        return super.instantiateItem(vg,position);
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        super.destroyItem(container,position,object);
    }

    @Override
    public Fragment getItem(int position){
        android.support.v4.app.Fragment fragment = null;
        switch (position) {
            case MainActivity.PAGE_ONE:
                fragment = weixinFragment;
                break;
            case MainActivity.PAGE_TWO:
                fragment = contactFragment;
                break;
            case MainActivity.PAGE_THREE:
                fragment = findFragment;
                break;
            case MainActivity.PAGE_FOUR:
                fragment = profileFragment;
                break;
        }
        return fragment;
    }
}
