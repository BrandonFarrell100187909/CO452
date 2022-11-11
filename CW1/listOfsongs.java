package CW1;
import java.util.ArrayList;
/*This class called listOfsongs manages the listOfsongs of the songs.

Author: Brandon Farrell
Version: 1.0
*/

public class listOfsongs 
{
private ArrayList<Song>listOfsongs;

 /*
  This will create a listOfsongs of songs.
  */
  public listOfsongs()
  {
    listOfsongs = new ArrayList<>();
  }
 
  /**
  This will get the size of the listOfsongs.
  */
  public int sizeOflistOfsongs()
  {
    return listOfsongs.size();
  }

    /* This is how a song is added to the listOfsongs
  */
  public void addSong(Song song)
  {
    listOfsongs.add(song);
  }

  /*
  This will delete a song from the active listOfsongs
  */
  public void deleteSong(int id)
  {
    listOfsongs.remove(id);
  }

    /*
  This will print every song in the listOfsongs of songs 
  */
  public void printAllSongs()
  {
    for (int index = 0; index < listOfsongs.size(); index++)
    {
        Song s = listOfsongs.get(index);
        System.out.print("["+(index+1)+"]");
        s.printSong();
    }
  }
    /**
  This will print a header for the listOfsongs so it will look like a table of information.
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
    for (int index = 0; index < listOfsongs.size(); index++)
      {        
        Song s = listOfsongs.get(index);
        if (s.gettimesplayedCount() > timesplayedCount)
        {
            System.out.print("["+(index+1)+"]");
            s.printSong();
        } 
      }
  }
}

