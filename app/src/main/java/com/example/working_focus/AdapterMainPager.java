package com.example.working_focus;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.working_focus.Home.FragmentHome;
import com.example.working_focus.Home.HomePresenterImpl;
import com.example.working_focus.Library.FragmentLibrary;
import com.example.working_focus.Library.LibraryPresenterImpl;
import com.example.working_focus.Search.FragmentSearch;
import com.example.working_focus.Search.SearchPresenterImpl;

public class AdapterMainPager extends FragmentPagerAdapter {
    private static final int PAGE_NUMBER = 3;
    private HomePresenterImpl mHomePresenter;
    private LibraryPresenterImpl mLibraryPresenter;
    private SearchPresenterImpl mSearchPresenter;


    public AdapterMainPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                FragmentHome fragmentHome = FragmentHome.newInstance();
                mHomePresenter = new HomePresenterImpl(fragmentHome);
                return fragmentHome;
            }
            case 1: {
                FragmentLibrary fragmentLibrary = FragmentLibrary.newInstance();
                mLibraryPresenter = new LibraryPresenterImpl(fragmentLibrary);
                return fragmentLibrary;

            }
            case 2: {
                FragmentSearch fragmentSearch = FragmentSearch.newInstance();
                mSearchPresenter = new SearchPresenterImpl(fragmentSearch);
                return fragmentSearch;

            }
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }
}
