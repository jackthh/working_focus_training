package com.example.working_focus.Search;

public class SearchPresenterImpl implements SearchContract.Presenter {
    private final SearchContract.View mSearchContractView;


    public SearchPresenterImpl(SearchContract.View libraryContractView) {
        mSearchContractView = libraryContractView;
        mSearchContractView.setPresenter(this);
    }
}
