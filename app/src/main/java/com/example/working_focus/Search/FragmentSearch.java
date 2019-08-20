package com.example.working_focus.Search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.working_focus.R;

public class FragmentSearch extends Fragment implements SearchContract.View {
    private SearchContract.Presenter mPresenter;

    public static FragmentSearch newInstance() {
        return new FragmentSearch();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentTemp = inflater.inflate(R.layout.fragment_search, container, false);

        return fragmentTemp;
    }

    @Override
    public void setPresenter(SearchContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
