package com.zingscoop.systemdesign.jukebox;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class JukeBox implements ISelector {

    private CDPlayer cdp;
    private Set<Playlist> playlists; // There could be multiple playlist in the JukeBox
    private Queue<Song> currentPlayQueue;

    public JukeBox(CDPlayer cdp) {
        this.cdp = cdp;
        this.playlists = this.cdp.getPlaylist();
        this.currentPlayQueue = new LinkedList<>(this.cdp.getCd().getSongs());
    }

    public void playPlaylist(String playlistName) {
        this.currentPlayQueue = this.playlists.stream().filter(p -> p.getName().equalsIgnoreCase(playlistName))
                .findFirst().get().getSongs();
    }

    @Override
    public void addSongToPlaylistButton(Song song, String playlistName) {
        Playlist pl = this.playlists.stream().filter(p -> p.getName().equalsIgnoreCase(playlistName)).findFirst()
                .orElse(null);
        pl.addSongToPlayList(song);
    }

    @Override
    public void nextSongButton() {
        System.out.println("Switch to next song in playlist");
    }

    @Override
    public void prevSongButton() {
        System.out.println("Switch to previous song in playlist");
    }

    @Override
    public void removeSongFromPlaylistButtton(Song song, String playlistName) {
        Playlist pl = this.playlists.stream().filter(p -> p.getName().equalsIgnoreCase(playlistName)).findFirst()
                .orElse(null);
        pl.removeSongFromPlaylist(song);
        System.out.println(pl);
    }

    @Override
    public void shuffleButton() {
        System.out.println("Shuffle all the songs in the playlist");
    }

    public CDPlayer getCd() {
        return cdp;
    }

    public void setCd(CDPlayer cdp) {
        this.cdp = cdp;
    }

    public Set<Playlist> getPlaylist() {
        return playlists;
    }

    public void setPlaylist(Set<Playlist> playlists) {
        this.playlists = playlists;
    }

    public Queue<Song> getCurrentPlayQueue() {
        return currentPlayQueue;
    }

    public void setCurrentPlayQueue(Queue<Song> currentPlayQueue) {
        this.currentPlayQueue = currentPlayQueue;
    }

    @Override
    public String toString() {
        return "JukeBox [CDPlayer =" + cdp + ", currentPlayQueue=" + currentPlayQueue + ", playlists=" + playlists
                + "]";
    }

}
