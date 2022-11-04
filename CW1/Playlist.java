package CW1;
import java.util.ArrayList;
/*This class called playlist manages the playlist of the songs.

Author: Brandon Farrell
Version: 1.0
*/

public class Playlist 
{
private ArrayList<Song>playlist;

 /*
  This will create a playlist of songs.
  */
  public Playlist()
  {
    playlist = new ArrayList<>();
  }
 
  /**
  This will get the size of the playlist.
  */
  public int sizeOfPlaylist()
  {
    return playlist.size();
  }

    /* This is how a song is added to the playlist
  */
  public void addSong(Song song)
  {
    playlist.add(song);
  }

  /*
  This will delete a song from the active playlist
  */
  public void deleteSong(int id)
  {
    playlist.remove(id);
  }

    /*
  This will print every song in the playlist of songs 
  */
  public void printAllSongs()
  {
    for (int index = 0; index < playlist.size(); index++)
    {
        Song s = playlist.get(index);
        System.out.print("["+(index+1)+"]");
        s.printSong();
    }
  }
    /**
  This will print a header for the playlist so it will look like a table of information.
  */
  
  public void printHeader()
  {
    System.out.println("Song           Artist        Plays");
    System.out.println("==================================");
  }

  /**
  This method prints selected songs over a specific amount of times the song is played.
  */
  public void printSelectSongs(int timesplayedCount)
  {
    for (int index = 0; index < playlist.size(); index++)
      {        
        Song s = playlist.get(index);
        if (s.gettimesplayedCount() > timesplayedCount)
        {
            System.out.print("["+(index+1)+"]");
            s.printSong();
        } 
      }
  }
}

