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

public class DrawRoundRectView extends View {

    private Paint mPaint = new Paint();

    public DrawRoundRectView(Context context) {
        super(context);
    }

    public DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);  // 抗锯齿

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(100, 100, 700, 700, 50, 70, mPaint);
        } else {
            RectF rectF = new RectF();
            rectF.set(100, 100, 700, 700);
            canvas.drawRoundRect(rectF, 50, 70, mPaint);
        }
    }
}
