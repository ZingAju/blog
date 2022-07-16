package com.zingscoop.systemdesign.jukebox;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class JukeBoxMainApp {

    public static void main(String[] args) {
        
        //Create bunch of songs
        Song s1 = new Song("Song 1", new Artist("Artist 1"), "Traditional");
        Song s2 = new Song("Song 2", new Artist("Artist 2"), "Traditional");
        Song s3 = new Song("Song 3", new Artist("Artist 3"), "Modern");
        Song s4 = new Song("Song 4", new Artist("Artist 4"), "Modern");
        Song s5 = new Song("Song 5", new Artist("Artist 5"), "Inspirational");

        // Put those songs in a CD
        CD cd = new CD(List.of(s1,s2,s3,s4));

        //Add few songs to Playlist
        Playlist playlist1 = new Playlist("TD playlist", new LinkedList<>(Arrays.asList(s1,s2)));
        Playlist playlist2 = new Playlist("Modern playlist", new LinkedList<>(Arrays.asList(s3,s4)));

        // Add playlist 
        CDPlayer cdPlayer = new CDPlayer(cd, Set.of(playlist1, playlist2));

        //Create Jukebox with just cd player
        JukeBox jukeBox = new JukeBox(cdPlayer);

        //Queue which playlist to play and add a song
        System.out.println("START ----- Testing JukeBox by adding songs to playlist");
        jukeBox.playPlaylist("TD playlist"); 
        jukeBox.addSongToPlaylistButton(s5, "TD playlist");
        System.out.println(jukeBox.getCurrentPlayQueue());

        System.out.println("---- Check if new song s5 is populated in the playlist ----");
        System.out.println(jukeBox.getPlaylist());
        
        //Now remove the S1 and check the playlist and queue.
        jukeBox.removeSongFromPlaylistButtton(s1, "TD playlist");
        System.out.println(jukeBox.getCurrentPlayQueue());

        System.out.println("---- Check if s1 song is removed from the playlist ----");
        System.out.println(jukeBox.getPlaylist());
        System.out.println("Testing JukeBox by adding songs to playlist ------ END");

    }
    
}
