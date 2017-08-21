package com.kuanggang.hencoderapp.function.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.kuanggang.hencoderapp.R;
import com.kuanggang.hencoderapp.base.BaseFragment;
import com.kuanggang.hencoderapp.model.denum.ClassPracticeEnum;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author KG on 2017/8/17.
 */

public class PracticeFragment extends BaseFragment implements PracticeContract.PreView {

    private static final String GET_CODE = "GET_CODE";
    private static final String GET_DATAS = "GET_DATAS";

    Unbinder unbinder;
    @BindView(R.id.framelayout)
    FrameLayout framelayout;

    private PracticeContract.Presenter mPresenter;
    private List<ClassPracticeEnum> mDatas;
    private int mCode;

    public static PracticeFragment newInstance(List<ClassPracticeEnum> mDatas, int code) {
        PracticeFragment practiceFragment = new PracticeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(GET_CODE, code);
        bundle.putSerializable(GET_DATAS, (Serializable) mDatas);
        practiceFragment.setArguments(bundle);
        return practiceFragment;
    }

    @Override
    public void setPresenter(PracticeContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCode = getArguments().getInt(GET_CODE);
        mDatas = (List<ClassPracticeEnum>) getArguments().getSerializable(GET_DATAS);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_practice, container, false);
        unbinder = ButterKnife.bind(this, root);

        init();
        return root;
    }

    private void init() {
        mPresenter.handleClassData(mCode, getActivity(), mDatas);
    }

    @Override
    public void showView(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(layoutParams);
        framelayout.addView(view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
