package com.zingscoop.systemdesign.jukebox;

public class Song {
    private String name;
    private Artist artist;
    private String genre;

    public Song(String name, Artist artist, String genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Artist getArtist() {
        return artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    @Override
    public String toString() {
        return "Song [artist=" + artist + ",\n genre=" + genre + ",\n name=" + name + "]";
    }
    
}
