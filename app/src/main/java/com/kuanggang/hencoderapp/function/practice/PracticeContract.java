package com.kuanggang.hencoderapp.function.practice;

import android.content.Context;
import android.view.View;

import com.kuanggang.hencoderapp.base.BasePresenter;
import com.kuanggang.hencoderapp.base.BaseView;
import com.kuanggang.hencoderapp.model.denum.ClassPracticeEnum;

import java.util.List;

/**
 * @author KG on 2017/8/17.
 */

public interface PracticeContract {

    interface PreView extends BaseView<Presenter> {
        void showView(View view);
    }

    interface Presenter extends BasePresenter {
        void handleClassData(int code, Context context, List<ClassPracticeEnum> mDatas);

        void handleClass1_1(Context context, List<ClassPracticeEnum> mDatas);
    }
}
