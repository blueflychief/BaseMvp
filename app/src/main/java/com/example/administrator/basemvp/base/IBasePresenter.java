package com.example.administrator.basemvp.base;

public interface IBasePresenter<T> {

    void detachView();

    void onCreate();

    void onStart();

    void onPause();

    void onResume();

    void onStop();

    void onDestroy();
}
