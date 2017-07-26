package com.pong.sample;

import com.pong.mvpstructure.MvpContract;

/**
 * Created by User on 26/7/2560.
 */

public interface SampleContract extends MvpContract {
    interface View extends MvpContract.View {
        void showMessage(String message);
    }

    interface Presenter extends MvpContract.Presenter<View> {
        void callMessage();
    }
}
