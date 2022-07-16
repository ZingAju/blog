package com.zingscoop.systemdesign.jukebox;

import java.util.List;

public class CD {

    List<Song> songs;

    public CD(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    
    
}
