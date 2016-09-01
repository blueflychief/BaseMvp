package com.example.administrator.basemvp.network;

public interface INetworkResponse{

    void onDataReady(BaseResponseEntity response );

    void onDataError(int requestCode, String message);
}
