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

public class DrawCircleView extends View {

    private Paint mPaint = new Paint();

    public DrawCircleView(Context context) {
        super(context);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);    // 画线框
        mPaint.setStrokeWidth(20);  // 线框宽度20px
        mPaint.setAntiAlias(true);  // 抗锯齿

        canvas.drawCircle(300, 300, 200, mPaint);
    }
}
