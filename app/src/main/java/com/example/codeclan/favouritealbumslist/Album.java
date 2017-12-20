package com.example.codeclan.favouritealbumslist;

import java.io.Serializable;

/**
 * Created by Weasel on 19/12/2017.
 */

public class Album implements Serializable {

    private Integer ranking;
    private String title;
    private String artist;

    public Album(Integer ranking, String title, String artist) {
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
