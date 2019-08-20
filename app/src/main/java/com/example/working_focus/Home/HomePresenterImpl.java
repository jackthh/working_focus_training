package com.example.working_focus.Home;

public class HomePresenterImpl implements HomeContract.Presenter {
    private final HomeContract.View mHomeContractView;

    public HomePresenterImpl(HomeContract.View homeContractView) {
        mHomeContractView = homeContractView;
        mHomeContractView.setPresenter(this);
    }


}
