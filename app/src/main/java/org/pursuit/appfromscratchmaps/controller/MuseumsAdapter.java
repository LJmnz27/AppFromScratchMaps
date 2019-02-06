package org.pursuit.appfromscratchmaps.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.appfromscratchmaps.R;
import org.pursuit.appfromscratchmaps.models.Museum;
import org.pursuit.appfromscratchmaps.view.MuseumViewHolder;

import java.util.List;

public class MuseumsAdapter extends RecyclerView.Adapter<MuseumViewHolder> {
    private List<Museum> museumList;

    public MuseumsAdapter(List<Museum>museumList){
        this.museumList=museumList;

    }
    @NonNull
    @Override
    public MuseumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false);
       return new MuseumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MuseumViewHolder museumViewHolder, int i) {
    MuseumViewHolder.onBind(museumList.get(i));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
