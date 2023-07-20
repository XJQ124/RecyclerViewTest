package com.example.recyclerviewtest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtest.ImageItem;
import com.example.recyclerviewtest.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.VH> { //创建RecyclerView Adapter：
    private List<ImageItem> items; // 添加items成员变量
    public RVAdapter(List<ImageItem> items){//接受图片和名称作为参数
        this.items = items;

    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_layout,parent,false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        ImageItem item = items.get(position);
        holder.iv.setImageResource(item.getImageResId());
        holder.title.setText(item.getName());
    }

    @Override
    public int getItemCount() {

        return items.size(); // 返回列表中的项数
    }

    class VH extends RecyclerView.ViewHolder{ //创建一个继承自RecyclerView.ViewHolder的视图持有者类，该类将用于绑定和管理每个列表项的视图。
        private ImageView iv;
        private TextView title; // 添加title成员变量
        public VH(@NonNull View v) {
            super(v);
            iv = v.findViewById(R.id.iv);
            title = v.findViewById(R.id.title);
        }
    }
}