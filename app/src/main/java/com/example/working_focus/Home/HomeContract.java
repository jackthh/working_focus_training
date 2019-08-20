package com.example.working_focus.Home;

import com.example.working_focus.BasePresenter;
import com.example.working_focus.BaseView;

import java.util.ArrayList;

public interface HomeContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        public ArrayList<SoundListItem> getSoundList();
    }
}
