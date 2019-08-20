package com.example.working_focus;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import at.grabner.circleprogress.CircleProgressView;

public class ActivityMain extends FragmentActivity {
    private CircleProgressView mCircleProgressView;
    private ViewPager mViewPager;
    private BottomNavigationView mBottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleProgressView = findViewById(R.id.circle_progress);

        // Setup Bottom Navigation
        mBottomNavigationView = findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        mViewPager.setCurrentItem(0);
                        return true;
                    case R.id.navigation_library:
                        mViewPager.setCurrentItem(1);
                        return true;
                    case R.id.navigation_search:
                        mViewPager.setCurrentItem(2);
                        return true;
                }
                return false;
            }
        });

        // Setup Main Pager
        AdapterMainPager AdapterMainPager = new AdapterMainPager(getSupportFragmentManager());
        mViewPager = findViewById(R.id.view_pager);
        mViewPager.setAdapter(AdapterMainPager);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0: {
                        mBottomNavigationView.setSelectedItemId(R.id.navigation_home);
                        break;
                    }
                    case 1: {
                        mBottomNavigationView.setSelectedItemId(R.id.navigation_library);
                        break;
                    }
                    case 2: {
                        mBottomNavigationView.setSelectedItemId(R.id.navigation_search);
                        break;
                    }
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // Make default tab
        mViewPager.setCurrentItem(0);

    }
}
