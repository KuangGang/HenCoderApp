package com.kuanggang.hencoderapp.function.practice;

import android.support.annotation.NonNull;

import com.kuanggang.hencoderapp.data.DataRepository;

/**
 * @author KG on 2017/8/17.
 */

public class PracticePresenter implements PracticeContract.Presenter {

    private PracticeContract.View mGankView;
    private DataRepository mDataRepository;


    public PracticePresenter(@NonNull PracticeContract.View gankView, DataRepository dataRepository) {
        mGankView = gankView;
        mDataRepository = dataRepository;

        mGankView.setPresenter(this);
    }
}
