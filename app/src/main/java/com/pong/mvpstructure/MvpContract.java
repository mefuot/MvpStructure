package com.pong.mvpstructure;

import android.content.Context;

/**
 * Created by User on 26/7/2560.
 */

public interface MvpContract {
    interface View {
        Presenter getPresenter();

        Context getViewContext();
    }

    interface ViewWithLoading extends View {
        void showLoading();

        void dismissLoading();
    }

    interface Presenter<V extends MvpContract.View> {
        void bind(V view);

        void unbind();

        V getView();

        void onViewCreated();

        void onViewStart();

        void onViewStop();

        void onViewDestroy();
    }
}
