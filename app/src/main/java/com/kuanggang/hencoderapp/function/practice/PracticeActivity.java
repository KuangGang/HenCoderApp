package com.kuanggang.hencoderapp.function.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.kuanggang.hencoderapp.Constants;
import com.kuanggang.hencoderapp.R;
import com.kuanggang.hencoderapp.base.BaseActivity;
import com.kuanggang.hencoderapp.model.denum.ClassPracticeEnum;
import com.kuanggang.hencoderapp.model.denum.HomeDataEnum;
import com.kuanggang.hencoderapp.utils.TextUtil;
import com.kuanggang.hencoderapp.widget.adapter.PracticePagerAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author KG on 2017/8/17.
 */

public class PracticeActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    private HomeDataEnum mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        ButterKnife.bind(this);

        initTitle();
        initActionBar(toolbar);
        initTabLayoutViewPager();
        initListener();
    }

    private void initTitle() {
        mData = (HomeDataEnum) getIntent().getSerializableExtra(Constants.CLASS_CODE);
        TextUtil.setFakeBoldText(tvTitle);
        tvTitle.setText(mData.title);
    }

    private void initTabLayoutViewPager() {
        PracticePagerAdapter mAdapter = new PracticePagerAdapter(getSupportFragmentManager(), mData.code);
        viewpager.setAdapter(mAdapter);
        tablayout.setupWithViewPager(viewpager);

        // 自定义tab布局
        List<ClassPracticeEnum> datas = mAdapter.getDatas();
        for (int i = 0; i < datas.size(); i++) {
            View tabView = View.inflate(this, R.layout.item_practice_tab, null);
            TextView tv = (TextView) tabView.findViewById(R.id.tv);
            tv.setText(datas.get(i).key);
            if (i == 0)
                tv.setSelected(true);

            TabLayout.Tab tab = tablayout.getTabAt(i);
            tab.setCustomView(tabView);
        }
    }

    private void initListener() {
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getCustomView().findViewById(R.id.tv).setSelected(true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getCustomView().findViewById(R.id.tv).setSelected(false);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
