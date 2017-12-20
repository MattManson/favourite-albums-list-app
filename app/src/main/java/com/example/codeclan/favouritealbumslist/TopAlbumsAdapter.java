package com.example.codeclan.favouritealbumslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Weasel on 19/12/2017.
 */

public class TopAlbumsAdapter extends ArrayAdapter<Album>{

    public TopAlbumsAdapter(Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);
        }
        Album currentAlbum = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.album_ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.album_title);
        title.setText(currentAlbum.getTitle().toString());

        TextView year = (TextView) listItemView.findViewById(R.id.artist);
        year.setText(currentAlbum.getArtist().toString());

        listItemView.setTag(currentAlbum);

        return listItemView;
    }

}
