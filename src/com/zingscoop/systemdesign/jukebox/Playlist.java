package com.zingscoop.systemdesign.jukebox;

import java.util.Queue;

public class Playlist {
    private String name;
    private Queue<Song> songs;

    public Playlist(String name) {
        this.name = name;
    }
    public Playlist(String name, Queue<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public void addSongToPlayList(Song song) {
        this.songs.add(song);
    }

    public void removeSongFromPlaylist(Song song) {
        this.songs.remove(song);
    }

    public Queue<Song> getSongs() {
        return songs;
    }
    public void setSongs(Queue<Song> songs) {
        this.songs = songs;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Playlist other = (Playlist) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Playlist [name=" + name + ", songs=" + songs + "]";
    }
    
}
