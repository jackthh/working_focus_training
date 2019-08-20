package com.example.working_focus;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Environment;

import androidx.annotation.NonNull;

import com.example.working_focus.util.Permission_Storage;

public class MainPresenterImpl implements MainContract.Presenter{
    private final MainContract.View mMainContractView;

    public MainPresenterImpl(MainContract.View mainContractView) {
        mMainContractView = mainContractView;
        mMainContractView.setPresenter(this);
    }


    @Override
    public void checkPermission() {
        mMainContractView.getActivity().checkSelfPermission(Permission_Storage.PERMISSION_NAME);


    }

    @Override
    public void onPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == Permission_Storage.REQUEST_CODE && grantResults[0] != PackageManager.PERMISSION_GRANTED) {

            if (mMainContractView.showRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                mMainContractView.showPermissionRequestExplaination();
            } else {
                mMainContractView.getActivity().requestPermissions(
                        new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, Permission_Storage.REQUEST_CODE);
            }
        }
    }


    @Override
    public boolean checkStorage() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;
    }
}
