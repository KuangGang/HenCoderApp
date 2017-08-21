package com.kuanggang.hencoderapp.function.practice;

import android.content.Context;
import android.support.annotation.NonNull;

import com.kuanggang.hencoderapp.data.DataRepository;
import com.kuanggang.hencoderapp.model.denum.ClassCode;
import com.kuanggang.hencoderapp.model.denum.ClassPracticeEnum;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawArcView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawCircleView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawColorView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawLineView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawLinesView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawOvalView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawPathView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawPointView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawPointsView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawRGBView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawRectView;
import com.kuanggang.hencoderapp.widget.customview.class1.DrawRoundRectView;

import java.util.List;

/**
 * @author KG on 2017/8/17.
 */

public class PracticePresenter implements PracticeContract.Presenter {

    private PracticeContract.PreView mGankView;
    private DataRepository mDataRepository;


    public PracticePresenter(@NonNull PracticeContract.PreView gankView, DataRepository dataRepository) {
        mGankView = gankView;
        mDataRepository = dataRepository;

        mGankView.setPresenter(this);
    }

    @Override
    public void handleClassData(int code, Context context, List<ClassPracticeEnum> datas) {
        if (code == ClassCode.CLASS1_1.code) {
            handleClass1_1(context, datas);
            return;
        }
    }

    @Override
    public void handleClass1_1(Context context, List<ClassPracticeEnum> datas) {
        if (datas == null || datas.size() <= 0) return;
        for (ClassPracticeEnum entity : datas) {
            switch (entity.key) {
                case "drawColor()":
                    mGankView.showView(new DrawColorView(context));
                    break;
                case "drawRGB()":
                    mGankView.showView(new DrawRGBView(context));
                    break;
                case "drawCircle()":
                    mGankView.showView(new DrawCircleView(context));
                    break;
                case "drawRect()":
                    mGankView.showView(new DrawRectView(context));
                    break;
                case "drawPoint()":
                    mGankView.showView(new DrawPointView(context));
                    break;
                case "drawPoints()":
                    mGankView.showView(new DrawPointsView(context));
                    break;
                case "drawOval()":
                    mGankView.showView(new DrawOvalView(context));
                    break;
                case "drawLine()":
                    mGankView.showView(new DrawLineView(context));
                    break;
                case "drawLines()":
                    mGankView.showView(new DrawLinesView(context));
                    break;
                case "drawRoundRect()":
                    mGankView.showView(new DrawRoundRectView(context));
                    break;
                case "drawArc()":
                    mGankView.showView(new DrawArcView(context));
                    break;
                case "drawPath()":
                    mGankView.showView(new DrawPathView(context));
                    break;
            }
        }
    }

}
