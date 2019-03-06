package com.owen.androidfragment;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AppBarLayout appBarLayout;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBarLayout = (AppBarLayout) findViewById(R.id.ap_appBar);
        viewPager = (ViewPager)findViewById(R.id.vp_viewwpager_xml);
        tabLayout = (TabLayout)findViewById(R.id.tl_tabLayout);

        ViewPageAdpter viewPageAdpter = new ViewPageAdpter(getSupportFragmentManager());

        viewPageAdpter.addFragment(new FragmentExplore(), "Explore");
        viewPageAdpter.addFragment(new FragmentQuiz(),"Quize");
        viewPageAdpter.addFragment(new FragmentStore(), "Store");

        viewPager.setAdapter(viewPageAdpter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
