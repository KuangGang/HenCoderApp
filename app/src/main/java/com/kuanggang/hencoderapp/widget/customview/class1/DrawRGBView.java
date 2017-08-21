package com.kuanggang.hencoderapp.widget.customview.class1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author KG on 2017/8/14.
 */

public class DrawRGBView extends View {

    public DrawRGBView(Context context) {
        super(context);
    }

    public DrawRGBView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRGBView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRGB(100, 200, 100);
        canvas.drawARGB(100, 100, 200, 100);
    }
}
