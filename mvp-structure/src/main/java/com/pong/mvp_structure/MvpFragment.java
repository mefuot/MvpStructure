package com.pong.mvp_structure;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by User on 26/7/2560.
 */

public abstract class MvpFragment<P extends MvpContract.Presenter>
        extends Fragment
        implements MvpContract.View {

    private P presenter;

    @SuppressWarnings("unchecked")
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = createPresenter();
        presenter.bind(this);
        getPresenter().onViewCreated();
    }


    @Override
    public P getPresenter() {
        if (presenter != null) {
            return presenter;
        } else {
            throw new NullPointerException("Presenter can't be null");
        }
    }

    @Override
    public Context getViewContext() {
        return getActivity();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        getPresenter().unbind();
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onViewStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        getPresenter().onViewStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().onViewDestroy();
    }

    public abstract P createPresenter();
}
