package com.example.working_focus.Library;

public class LibraryPresenterImpl implements LibraryContract.Presenter {
    private final LibraryContract.View mLibraryContractView;

    public LibraryPresenterImpl(LibraryContract.View libraryContractView) {
        mLibraryContractView = libraryContractView;
        mLibraryContractView.setPresenter(this);
    }
}
