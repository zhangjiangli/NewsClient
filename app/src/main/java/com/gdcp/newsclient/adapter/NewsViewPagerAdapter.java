package com.gdcp.newsclient.adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by asus- on 2017/6/27.
 */

public class NewsViewPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment>fragmentList;
    public NewsViewPagerAdapter(FragmentManager fm, List<Fragment>fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
