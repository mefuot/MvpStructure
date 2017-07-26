package com.pong.sample.service;

/**
 * Created by User on 26/7/2560.
 */

public interface SampleService {
    public interface OnSampleServiceCallback<T> {
        void onApiSuccess(T response);

        void onApiFailed(String error);
    }

    void callMessage(OnSampleServiceCallback<String> callback);
}
