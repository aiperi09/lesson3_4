package com.geektech.lesson3_4;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private ImageView image;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name= itemView.findViewById(R.id.text);
        image=itemView.findViewById(R.id.image);

    }
    public void onBind(Model name){
        this.name.setText(name.getName());
        image.setImageResource(name.getImage());
    }
}

