package com.example.working_focus;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterFragment extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mFragmentName = new ArrayList<>();

    public AdapterFragment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentName.get(position);
    }

    public void addFragment(Fragment fragment, String tittle) {
        this.mFragmentList.add(fragment);
        this.mFragmentName.add(tittle);
    }
}
