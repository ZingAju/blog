package com.zingscoop.systemdesign.jukebox;

public interface ISelector {
    public void shuffleButton();
    public void nextSongButton();
    public void prevSongButton();
    public void addSongToPlaylistButton(Song song, String playlistName);
    public void removeSongFromPlaylistButtton(Song song, String playlistName);
}
