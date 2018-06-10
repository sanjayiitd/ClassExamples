package com.example.sony.tabwithswipe;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter{
    private final int count;

    public TabPagerAdapter(FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            return new Android_Frag1();
            case 1:
                return new ios_Frag2();
            case 2:
                return new window_Frag3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }
}
