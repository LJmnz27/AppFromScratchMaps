package org.pursuit.appfromscratchmaps.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import org.pursuit.appfromscratchmaps.models.Museum;

public class MuseumViewHolder extends RecyclerView.ViewHolder {


    public MuseumViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public static void onBind(Museum museum) {

    }
}
