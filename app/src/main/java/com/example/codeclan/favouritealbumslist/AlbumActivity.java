package com.example.codeclan.favouritealbumslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Intent intent = getIntent();
        Album album = (Album)intent.getSerializableExtra("album");
        Log.d("Album Title: ", album.getTitle());

        TextView title = findViewById(R.id.album_title);
        title.setText(album.getTitle());

        TextView ranking = findViewById(R.id.album_ranking);
        ranking.setText(album.getRanking().toString());

        TextView album_info = findViewById(R.id.album_info);
        album_info.setText(album.getArtist());
    }
}
