package com.ptp.phamtanphat.tablayout1409;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 12/12/2017.
 */

public class CustomViewPager extends FragmentPagerAdapter {
    ArrayList<Fragment> mangfragment = new ArrayList<>();
    ArrayList<String> mangtitle = new ArrayList<>();

    public CustomViewPager(FragmentManager fm, ArrayList<Fragment> mangfragment, ArrayList<String> mangtitle) {
        super(fm);
        this.mangfragment = mangfragment;
        this.mangtitle = mangtitle;
    }

    public CustomViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mangfragment.get(position);
    }

    @Override
    public int getCount() {
        return mangfragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mangtitle.get(position);
    }

}
