package com.xasanov.moveteacher.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xasanov.moveteacher.fragments.AbstractTabFragment;
import com.xasanov.moveteacher.fragments.FirstFragment;
import com.xasanov.moveteacher.fragments.SecondFragment;

import java.util.HashMap;
import java.util.Map;



public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer,AbstractTabFragment> tabs;

    public TabsPagerFragmentAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        initTabs(ctx);
    }

    private void initTabs(Context ctx) {



    tabs  = new HashMap<>();

            tabs.put(0, FirstFragment.getInstance(ctx));
            tabs.put(1, SecondFragment.getInstance(ctx));

    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
       return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
