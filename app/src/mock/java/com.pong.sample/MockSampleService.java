package com.pong.sample;

import com.pong.sample.service.SampleService;

/**
 * Created by User on 26/7/2560.
 */

public class MockSampleService implements SampleService {
    @Override
    public void callMessage(OnSampleServiceCallback<String> callback) {
        callback.onApiSuccess("call from MOCK flavor.");
    }
}
