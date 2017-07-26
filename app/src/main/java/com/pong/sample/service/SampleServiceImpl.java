package com.pong.sample.service;

/**
 * Created by User on 26/7/2560.
 */

public class SampleServiceImpl implements SampleService {
    @Override
    public void callMessage(OnSampleServiceCallback<String> callback) {
        callback.onApiSuccess("call from Prod flavor.");
    }
}
