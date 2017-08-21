package com.kuanggang.hencoderapp.model.denum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KG on 2017/8/17.
 */

public enum ClassPracticeEnum {
    DRAWCOLOR(ClassCode.CLASS1_1.code, "drawColor()"),
    DRAWRGB(ClassCode.CLASS1_1.code, "drawRGB()"),
    DRAWCIRCLE(ClassCode.CLASS1_1.code, "drawCircle()"),
    DRAWRECT(ClassCode.CLASS1_1.code, "drawRect()"),
    DRAWPOINT(ClassCode.CLASS1_1.code, "drawPoint()"),
    DRAWPOINTS(ClassCode.CLASS1_1.code, "drawPoints()"),
    DRAWOVAL(ClassCode.CLASS1_1.code, "drawOval()"),
    DRAWLINE(ClassCode.CLASS1_1.code, "drawLine()"),
    DRAWLINES(ClassCode.CLASS1_1.code, "drawLines()"),
    DRAWROUNDRECT(ClassCode.CLASS1_1.code, "drawRoundRect()"),
    DRAWARC(ClassCode.CLASS1_1.code, "drawArc()"),
    DRAWPATH(ClassCode.CLASS1_1.code, "drawPath()");
    public int code;
    public String key;

    ClassPracticeEnum(int code, String key) {
        this.code = code;
        this.key = key;
    }

    public static List<ClassPracticeEnum> getPracticeByCode(int code) {
        List<ClassPracticeEnum> mList = new ArrayList<>();
        for (ClassPracticeEnum element : values()) {
            if (element.code == code)
                mList.add(element);
        }
        return mList;
    }
}
