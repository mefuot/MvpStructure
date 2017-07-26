package com.pong.sample.data;

import com.pong.sample.service.SampleService;

/**
 * Created by User on 26/7/2560.
 */

public interface SampleRepository {
    void callMessage(SampleService.OnSampleServiceCallback<String> callback);
}
