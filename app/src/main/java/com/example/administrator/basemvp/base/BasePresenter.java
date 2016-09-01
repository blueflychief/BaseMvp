package com.example.administrator.basemvp.base;

import com.example.administrator.basemvp.network.BaseResponseEntity;
import com.example.administrator.basemvp.network.INetworkResponse;

public abstract class BasePresenter<T> implements IBasePresenter<T>, INetworkResponse {
    public T mView;
    public INetworkResponse mNetworkResponse;

    public BasePresenter(T view, INetworkResponse networkResponse) {
        this.mView = view;
        this.mNetworkResponse = networkResponse;
    }

    @Override
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        detachView();
    }

    @Override
    public void onDataReady(BaseResponseEntity response) {
        if (mView == null) {
            return;
        }
        mNetworkResponse.onDataReady(response);
    }

    @Override
    public void onDataError(int requestCode, String message) {
        if (mView == null) {
            return;
        }
        mNetworkResponse.onDataError(requestCode, message);
    }
}
