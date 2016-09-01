package com.example.administrator.basemvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends FragmentActivity {
    protected T mPrecenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPrecenter = initPresenter();
        if (mPrecenter != null) {
            mPrecenter.onCreate();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mPrecenter != null) {
            mPrecenter.onStart();
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (mPrecenter != null) {
            mPrecenter.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPrecenter != null) {
            mPrecenter.onResume();
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        if (mPrecenter != null) {
            mPrecenter.onStop();
        }
    }


    @Override
    protected void onDestroy() {
        if (mPrecenter != null) {
            mPrecenter.onDestroy();
        }
        super.onDestroy();
    }


    protected abstract T initPresenter();
}
