package com.kuanggang.hencoderapp.function.practice;

import com.kuanggang.hencoderapp.base.BaseFragment;

/**
 * @author KG on 2017/8/17.
 */

public class PracticeFragment extends BaseFragment implements PracticeContract.View {

    private PracticeContract.Presenter mPresenter;

    public static PracticeFragment newInstance() {
        return new PracticeFragment();
    }

    @Override
    public void setPresenter(PracticeContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
