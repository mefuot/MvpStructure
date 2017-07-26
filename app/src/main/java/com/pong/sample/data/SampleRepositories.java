package com.pong.sample.data;

import android.support.annotation.NonNull;

import com.pong.sample.service.SampleService;

/**
 * Created by User on 26/7/2560.
 */

public class SampleRepositories implements SampleRepository {

    private final SampleService mService;

    private static SampleRepositories repository = null;

    private SampleRepositories(@NonNull SampleService service) {
        mService = service;
    }

    public static synchronized SampleRepository getRepository(@NonNull SampleService service) {
        if (repository == null) {
            repository = new SampleRepositories(service);
        }
        return repository;
    }

    @Override
    public void callMessage(SampleService.OnSampleServiceCallback<String> callback) {
        mService.callMessage(callback);
    }
}
