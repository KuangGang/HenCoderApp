package com.kuanggang.hencoderapp.widget.customview.class1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author KG on 2017/8/14.
 */

public class DrawPointsView extends View {

    private Paint mPaint = new Paint();

    public DrawPointsView(Context context) {
        super(context);
    }

    public DrawPointsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPointsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(40);  // 决定了点的大小
        mPaint.setAntiAlias(true);  // 抗锯齿
        mPaint.setStrokeCap(Paint.Cap.SQUARE);   // 画方点

        float[] points = {0, 0, 60, 60, 200, 60, 60, 200, 200, 200, 0 ,0};
        canvas.drawPoints(points, 2, 8 ,mPaint);    // 从第3个数开始取8个数，画4个点
    }
}
