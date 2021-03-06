package com.kuanggang.hencoderapp.function;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kuanggang.hencoderapp.Constants;
import com.kuanggang.hencoderapp.R;
import com.kuanggang.hencoderapp.base.BaseActivity;
import com.kuanggang.hencoderapp.function.practice.PracticeActivity;
import com.kuanggang.hencoderapp.model.denum.HomeDataEnum;
import com.kuanggang.hencoderapp.utils.TextUtil;
import com.kuanggang.hencoderapp.utils.ToastUtil;
import com.kuanggang.hencoderapp.widget.customview.WebViewLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author KG on 2017/7/5.
 */

public class BrowserActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.iv_close)
    ImageView ivClose;
    @BindView(R.id.webViewLayout)
    WebViewLayout webViewLayout;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.fab_practice)
    FloatingActionButton fabPractice;

    private HomeDataEnum mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        ButterKnife.bind(this);
        TextUtil.setFakeBoldText(tvTitle);

        initActionBar(toolbar);
        initListener();
        loadUrl();
    }

    private void initListener() {
        ivClose.setOnClickListener(this);
        fabPractice.setOnClickListener(this);
    }

    private void loadUrl() {
        mData = (HomeDataEnum) getIntent().getSerializableExtra(Constants.URL_KEY);
        if (mData == null) {
            ToastUtil.show(this, R.string.error_date);
            return;
        }
        tvTitle.setText(mData.title);
        webViewLayout.loadUrl(mData.url);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_close:
                finish();
                break;
            case R.id.fab_practice:
                if (mData == null) return;
                Intent intent = new Intent(this, PracticeActivity.class);
                intent.putExtra(Constants.CLASS_CODE, mData);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (webViewLayout == null) return;
        webViewLayout.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (webViewLayout == null) return;
        webViewLayout.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (webViewLayout == null) return;
        webViewLayout.onDestroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webViewLayout.goBack()) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
