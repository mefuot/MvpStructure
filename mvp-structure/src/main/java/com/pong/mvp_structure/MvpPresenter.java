package com.pong.mvp_structure;

import java.lang.ref.WeakReference;

/**
 * Created by User on 26/7/2560.
 */

public class MvpPresenter<V extends MvpContract.View> implements MvpContract.Presenter<V> {
    private WeakReference<V> mView;

    @Override
    public void bind(V view) {
        mView = new WeakReference<>(view);
    }

    @Override
    public void unbind() {
        mView = null;
    }

    @Override
    public V getView() {
        if (mView != null) {
            return mView.get();
        } else {
            throw new NullPointerException("View can't be null");
        }
    }

    @Override
    public void onViewCreated() {
        //Implement
    }

    @Override
    public void onViewStart() {
        //Implement
    }

    @Override
    public void onViewStop() {
        //Implement
    }

    @Override
    public void onViewDestroy() {
        //Implement
    }
}
