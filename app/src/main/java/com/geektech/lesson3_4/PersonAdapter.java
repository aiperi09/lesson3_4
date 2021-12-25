package com.geektech.lesson3_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Model> namePerson = new ArrayList<>();

    public void setNamePerson(ArrayList<Model> namePerson) {
        this.namePerson = namePerson;
    }

    public PersonAdapter(ArrayList<Model> namePerson) {
        this.namePerson = namePerson;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person,parent,false ));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.onBind(namePerson.get(position));
    }

    @Override
    public int getItemCount() {
        return namePerson.size();
    }
}
