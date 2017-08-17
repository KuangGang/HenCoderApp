package com.kuanggang.hencoderapp.model.denum;

/**
 * @author KG on 2017/7/5.
 */

public enum PageSizeEnum {
    FIVE(5),
    TEN(10),
    FIFTEEN(15),
    TWENTY(20);
    public int size;

    PageSizeEnum(int size) {
        this.size = size;
    }
}
