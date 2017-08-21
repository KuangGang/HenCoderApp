package com.kuanggang.hencoderapp.widget.customview.class1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author KG on 2017/8/14.
 */

public class DrawArcView extends View {

    private Paint mPaint = new Paint();

    public DrawArcView(Context context) {
        super(context);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);  // 抗锯齿

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(200, 100, 800, 500, -110, 100, true, mPaint); // 绘制扇形
            canvas.drawArc(200, 100, 800, 500, 20, 140, false, mPaint); // 绘制弧形
        } else {
            RectF rectF = new RectF();
            rectF.set(200, 100, 800, 500);
            canvas.drawArc(rectF, -110, 100, true, mPaint);// 绘制扇形
            canvas.drawArc(rectF, 20, 140, false, mPaint); // 绘制弧形
        }
    }
}
