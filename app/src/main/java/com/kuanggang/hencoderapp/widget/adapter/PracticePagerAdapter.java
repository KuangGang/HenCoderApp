package com.kuanggang.hencoderapp.widget.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kuanggang.hencoderapp.data.DataRepository;
import com.kuanggang.hencoderapp.data.local.LocalDataSource;
import com.kuanggang.hencoderapp.data.remote.RemoteDataSource;
import com.kuanggang.hencoderapp.function.practice.PracticeFragment;
import com.kuanggang.hencoderapp.function.practice.PracticePresenter;
import com.kuanggang.hencoderapp.model.denum.ClassPracticeEnum;

import java.util.List;

/**
 * @author KG on 2017/8/17.
 */

public class PracticePagerAdapter extends FragmentPagerAdapter {

    private List<ClassPracticeEnum> mDatas;
    private int code;

    public PracticePagerAdapter(FragmentManager fm, int code) {
        super(fm);
        this.mDatas = ClassPracticeEnum.getPracticeByCode(code);
        this.code = code;
    }

    @Override
    public Fragment getItem(int position) {
        PracticeFragment practiceFragment = PracticeFragment.newInstance(mDatas, code);
        // 绑定view和presenter
        DataRepository dataRepository = new DataRepository(new RemoteDataSource(), new LocalDataSource());
        new PracticePresenter(practiceFragment, dataRepository);
        return practiceFragment;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    public List<ClassPracticeEnum> getDatas() {
        return mDatas;
    }
}
