package com.example.recycler;



import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageview;
    TextView mTitle,mDes;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageview= itemView.findViewById(R.id.imageIv);
        this.mTitle= itemView.findViewById(R.id.titletv);
        this.mDes= itemView.findViewById(R.id.deskripsi);
    }
}
