package com.example.administrator.basemvp.network;

public interface NetworkResponse<T extends BaseResponseEntity>{

    void onDataReady(T response);


    void onDataError(int requestCode, String message);
}
