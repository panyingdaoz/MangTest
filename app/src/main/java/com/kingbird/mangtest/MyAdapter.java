package com.kingbird.mangtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.socks.library.KLog;

import java.util.List;

/**
 * @ClassName: MyAdapter
 * @Description: Adapter类
 * @Author: Pan
 * @CreateDate: 2020/1/9 17:38
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<HomeContent> mDataList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mSubtitle;
        TextView mContent;

        MyViewHolder(View view) {
            super(view);
            mImageView = view.findViewById(R.id.imageViewContent);
            mSubtitle = view.findViewById(R.id.subtitle);
            mContent = view.findViewById(R.id.content);
        }
    }

    public MyAdapter(List<HomeContent> dataList) {
        mDataList = dataList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item_content, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        try {
            HomeContent display = mDataList.get(position);
            holder.mImageView.setImageResource(display.getmImageView());
            holder.mSubtitle.setText(display.getmSubtitle());
            holder.mContent.setText(display.getContent());
        } catch (Exception e) {
            KLog.e("异常原因：" + e.toString());
        }
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}


