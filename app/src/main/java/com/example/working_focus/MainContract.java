package com.example.working_focus;

import android.app.Activity;

import androidx.annotation.NonNull;

public class MainContract {
    interface View extends BaseView<Presenter> {
        public Activity getActivity();
        public boolean showRationale(String permission);
        public void showPermissionRequestExplaination();

    }

    interface Presenter extends BasePresenter {
        public void checkPermission();
        public boolean checkStorage();
        public void onPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);


    }
}
