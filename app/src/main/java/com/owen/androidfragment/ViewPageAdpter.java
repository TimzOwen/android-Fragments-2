package com.owen.androidfragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPageAdpter extends FragmentPagerAdapter
{

    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> arrayListTitles = new ArrayList<>();

    public ViewPageAdpter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount()
    {
        return arrayListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        return arrayListTitles.get(position);
    }

    public void addFragment(Fragment fragment, String titles)
    {
        fragmentArrayList.add(fragment);
        arrayListTitles.add(titles);
    }
}
