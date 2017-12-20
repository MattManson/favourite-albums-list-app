package com.example.codeclan.favouritealbumslist;

import java.util.ArrayList;

/**
 * Created by Weasel on 19/12/2017.
 */

public class TopAlbums {

    private ArrayList<Album> list;

    public TopAlbums(){
        list = new ArrayList<>();
        list.add(new Album(1, "Leviathan", "Mastodon"));
        list.add(new Album(2, "Misanthropy Pure", "Shai Hulud"));
        list.add(new Album(3, "Seasons in the Abyss", "Slayer"));
        list.add(new Album(4, "Evil Empire", "Rage Against The Machine"));
        list.add(new Album(5, "Rage Against The Machine", "Rage Against the Machine"));
        list.add(new Album(6,"Battle of Los Angeles", "Rage Against The Machine"));
        list.add(new Album(7, "Blossom", "Frank Carter and the Rattlesnakes"));
        list.add(new Album(8, "The Company Band", "The Company Band"));
        list.add(new Album(9, "Robot Hive/ Exodus", "Clutch"));
        list.add(new Album(10,"The Bronx IV", "The Bronx"));
        list.add(new Album(11, "Afraid of Heights", "Billy Talent"));
        list.add(new Album(12, "Mule Variations", "Tom Waits"));
    }

    public ArrayList<Album> getList() {
        return new ArrayList<Album>(list);
    }
}
