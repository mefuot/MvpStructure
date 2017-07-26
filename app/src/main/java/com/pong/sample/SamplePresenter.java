package com.pong.sample;

import android.support.annotation.NonNull;

import com.pong.mvpstructure.MvpPresenter;
import com.pong.sample.data.SampleRepository;
import com.pong.sample.service.SampleService;

/**
 * Created by User on 26/7/2560.
 */

public class SamplePresenter
        extends MvpPresenter<SampleContract.View>
        implements SampleContract.Presenter, SampleService.OnSampleServiceCallback<String> {

    private final SampleRepository mSampleRepository;

    public static SamplePresenter create() {
        return new SamplePresenter(Injection.provideSampleRepository());
    }

    public SamplePresenter(@NonNull final SampleRepository sampleRepository) {
        this.mSampleRepository = sampleRepository;
    }

    @Override
    public void callMessage() {
        mSampleRepository.callMessage(this);
    }

    @Override
    public void onApiSuccess(String response) {
        getView().showMessage(response);
    }

    @Override
    public void onApiFailed(String error) {
        getView().showMessage("Error:" + error);
    }
}
