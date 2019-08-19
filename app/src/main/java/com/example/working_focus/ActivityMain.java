package com.example.working_focus;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
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


        // Makes activity fullscreen
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

        mCircleProgressView = findViewById(R.id.circle_progress);
        mViewPager = findViewById(R.id.view_pager);
        mBottomNavigationView = findViewById(R.id.bottom_navigation);

        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
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
                }
        );


        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        mBottomNavigationView.setSelectedItemId(R.id.navigation_home);
                        break;
                    case 1:
                        mBottomNavigationView.setSelectedItemId(R.id.navigation_library);
                        break;

                    case 2:
                        mBottomNavigationView.setSelectedItemId(R.id.navigation_search);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


        mViewPager.setCurrentItem(0);
        setupFragment(ActivityMain.this.getSupportFragmentManager(), mViewPager);
    }
    /*End of OnCreate*/


    public static void setupFragment(FragmentManager fragmentManager, ViewPager viewPager) {
        AdapterFragment adapter = new AdapterFragment(fragmentManager);

        adapter.addFragment(new FragmentHome(), "Home");
        adapter.addFragment(new FragmentLibrary(), "Library");
        adapter.addFragment(new FragmentSearch(), "Search");

        viewPager.setAdapter(adapter);

    }
}
