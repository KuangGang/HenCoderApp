package com.kuanggang.hencoderapp.utils;

import android.content.Context;
import android.text.ClipboardManager;
import android.widget.TextView;

import com.kuanggang.hencoderapp.AppApplication;

/**
 * @author KG on 2017/7/20.
 */

public class TextUtil {

    public static void setFakeBoldText(TextView tv) {
        tv.getPaint().setFakeBoldText(true);
    }

    @SuppressWarnings("deprecation")
    public static void copyToClipBoard(String str) {
        ClipboardManager cm = (ClipboardManager) AppApplication.application.getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(str);
    }
}
