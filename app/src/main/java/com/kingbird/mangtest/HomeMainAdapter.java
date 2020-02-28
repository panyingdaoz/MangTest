//package com.kingbird.mangtest;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
///**
// * @ClassName: HomeMainAdapter
// * @Description: java类作用描述
// * @Author: Pan
// * @CreateDate: 2020/2/28 15:04:25
// */
//public class HomeMainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//    private int ITEM_TITLE = 1;
//    private int ITEM_CONTENT = 2;
//    private List<HomeContent> mDataList;
//    private int resourceId;
//
//    public HomeMainAdapter(Context context,int textViewResourceId,List<HomeContent> objects){
//        super(context,textViewResourceId,objects);
//        resourceId=textViewResourceId;
//
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view=null;
//        RecyclerView.ViewHolder holder=null;
//        if (viewType==ITEM_TITLE){
//            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item_content,parent,false);
//            holder=new ViewHold;
//        }else if ((viewType==ITEM_CONTENT)){
//            view
//        }
//
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    class ViewHolderContent extends RecyclerView.ViewHolder{
//
//        public ViewHolderContent(@NonNull View itemView) {
//            super(itemView);
//        }
//    }
//}
