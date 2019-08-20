package com.example.working_focus.Library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.working_focus.R;

public class FragmentLibrary extends Fragment implements LibraryContract.View {
    private LibraryContract.Presenter mPresenter;

    public static FragmentLibrary newInstance() {
        return new FragmentLibrary();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentTemp = inflater.inflate(R.layout.fragment_library, container, false);

        return fragmentTemp;
    }

    @Override
    public void setPresenter(LibraryContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
