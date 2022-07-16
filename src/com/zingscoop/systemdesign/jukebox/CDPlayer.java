package com.zingscoop.systemdesign.jukebox;

import java.util.Set;

public class CDPlayer {

    private CD cd;
    private Set<Playlist> playlist;

    public CDPlayer(CD cd) {
        this.cd = cd;
    }

    public CDPlayer(CD cd, Set<Playlist> playlist) {
        this.cd = cd;
        this.playlist = playlist;
    }
    public CD getCd() {
        return cd;
    }
    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Set<Playlist> getPlaylist() {
        return playlist;
    }

    @Override
    public String toString() {
        return "CDPlayer [cd=" + cd + ",\n playlist=" + playlist + "]";
    }
    
}
