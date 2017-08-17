package com.kuanggang.hencoderapp.model.denum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KG on 2017/8/17.
 */

public enum ClassPracticeEnum {
    DRAWCOLOR(ClassCode.CLASS1_1.code, "drawColor");
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
