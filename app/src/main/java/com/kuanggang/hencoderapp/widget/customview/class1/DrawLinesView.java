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

public class DrawLinesView extends View {

    private Paint mPaint = new Paint();

    public DrawLinesView(Context context) {
        super(context);
    }

    public DrawLinesView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLinesView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);  // 抗锯齿
        mPaint.setStrokeWidth(30);

        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
        canvas.drawLines(points, mPaint);
    }
}
