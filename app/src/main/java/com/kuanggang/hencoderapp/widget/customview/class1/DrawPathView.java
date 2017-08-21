package com.kuanggang.hencoderapp.widget.customview.class1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author KG on 2017/8/14.
 */

public class DrawPathView extends View {

    private Paint mPaint = new Paint();
    private Path mPath = new Path();

    public DrawPathView(Context context) {
        super(context);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(20);
        mPaint.setAntiAlias(true);  // 抗锯齿

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mPath.addArc(200, 200, 400, 400, -225, 225);    // 画弧线
            mPath.arcTo(400, 200, 600, 400, -180, 225, false);  // 画弧线（连接线到起点）
            mPath.lineTo(400, 542); // 连线
            canvas.drawPath(mPath, mPaint);
//            addCircle();    // 添加图形
//            quadTo();   // 画二次贝塞尔曲线
//            cubicTo();    // 画三次贝塞尔曲线
//            moveTo();   // 移动画笔到目标位置
//            close();    // 封闭当前图形
        }
    }
}
