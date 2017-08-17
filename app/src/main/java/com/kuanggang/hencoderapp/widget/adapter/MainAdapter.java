package com.kuanggang.hencoderapp.widget.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kuanggang.hencoderapp.AppApplication;
import com.kuanggang.hencoderapp.Constants;
import com.kuanggang.hencoderapp.R;
import com.kuanggang.hencoderapp.function.BrowserActivity;
import com.kuanggang.hencoderapp.model.denum.HomeDataEnum;
import com.kuanggang.hencoderapp.utils.DensityUtil;
import com.kuanggang.hencoderapp.utils.GlideUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author KG on 2017/8/15.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item_main_list, null);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        HomeDataEnum entity = HomeDataEnum.values()[position];
        holder.tvTitle.setText(entity.title);
        holder.tvDesc.setText(entity.desc);
        GlideUtils.newInstance().loadNetImage(entity.imageUrl, holder.iv);
        holder.cardView.setOnClickListener(v -> {
            Context context = holder.cardView.getContext();
            Intent intent = new Intent(context, BrowserActivity.class);
            intent.putExtra(Constants.URL_KEY, entity);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return HomeDataEnum.values().length;
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv)
        ImageView iv;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_desc)
        TextView tvDesc;
        @BindView(R.id.cardView)
        CardView cardView;

        MainViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) iv.getLayoutParams();
            layoutParams.height = (DensityUtil.getScreenWidth(AppApplication.application) - DensityUtil.dip2px(AppApplication.application, 30)) / 16 * 9;
            iv.setLayoutParams(layoutParams);
        }
    }
}
