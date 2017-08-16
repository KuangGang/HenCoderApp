package com.kuanggang.hencoderapp.model.type;

import java.io.Serializable;

/**
 * @author KG on 2017/8/15.
 */

public enum HomeDataEnum implements Serializable {
    CLASS1_1("自定义 View 1-1 绘制基础",
            "从今天开始，HenCoder 就正式开讲知识技能了。按照我的计划，第一季是 UI，UI 一共分为三部分：绘制、布局和触摸反馈。",
            "http://hencoder.com/ui-1-1/",
            "http://hencoder.com/content/images/2017/07/cover_1.png",
            1),
    CLASS1_2("自定义 View 1-2 Paint 详解",
            "上一期我已经简单说过， Canvas 的 drawXXX() 方法配合 Paint 的几个常用方法可以实现最常见的绘制需求。",
            "http://hencoder.com/ui-1-2/",
            "http://hencoder.com/content/images/2017/07/cover_2.png",
            2),
    CLASS1_3("自定义 View 1-3 文字的绘制",
            "文字的绘制所能控制的内容太多太细，必须拆成单独的一期专门来讲。今天这期，就是来把这些细节讲清楚的。",
            "http://hencoder.com/ui-1-3/",
            "http://hencoder.com/content/images/2017/07/cover_1-3.jpg",
            3),
    CLASS1_4("自定义 View 1-4 Canvas 对绘制的辅助",
            "Canvas 对绘制的辅助——范围裁切和几何变换。",
            "http://hencoder.com/ui-1-4/",
            "http://hencoder.com/content/images/2017/08/Screen-Shot-2017-08-04-at-02.16.23.png",
            4),
    CLASS1_5("自定义 View 1-5 绘制顺序",
            "Android 里面的绘制都是按顺序的，先绘制的内容会被后绘制的盖住。怎么实现自己需要的遮盖关系，就是这期的内容。",
            "http://hencoder.com/ui-1-5/",
            "http://hencoder.com/content/images/2017/08/Screen-Shot-2017-08-14-at-10.02.11.png",
            1);
    public String title;
    public String desc;
    public String url;
    public String imageUrl;
    public int code;

    HomeDataEnum(String title, String desc, String url, String imageUrl, int code) {
        this.title = title;
        this.desc = desc;
        this.url = url;
        this.imageUrl = imageUrl;
        this.code = code;
    }

    public static HomeDataEnum get(int code) {
        for (HomeDataEnum element : values()) {
            if (element.code == code)
                return element;
        }
        return null;
    }
}
