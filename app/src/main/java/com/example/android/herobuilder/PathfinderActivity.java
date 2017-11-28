package com.example.android.herobuilder;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class PathfinderActivity extends AppCompatActivity {
    // ViewPager and PagerAdapter
    CharacterPagerAdapter mPFCharacterPagerAdapter;
    ViewPager mPFCharacterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pathfinder);

        // Set up the ViewPager Adapter
        mPFCharacterPagerAdapter =
                new CharacterPagerAdapter(this, getSupportFragmentManager());
        mPFCharacterViewPager = (ViewPager) findViewById(R.id.PFpager);
        mPFCharacterViewPager.setAdapter(mPFCharacterPagerAdapter);

        // Set up TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mPFCharacterViewPager);

    }
}
