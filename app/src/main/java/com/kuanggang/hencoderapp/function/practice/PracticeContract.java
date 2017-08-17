package com.kuanggang.hencoderapp.function.practice;

import com.kuanggang.hencoderapp.base.BasePresenter;
import com.kuanggang.hencoderapp.base.BaseView;

/**
 * @author KG on 2017/8/17.
 */

public interface PracticeContract {

    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {
    }
}
