/*This class called song defines the data and the method to store the name of the song aka songName,
the artist of the song and the amount of plays.

Author: Brandon Farrell
Version: 1.0
*/
package CW1;

public class Song 
{
    String songName;
    String creatorName;
    int timesplayedCount;
  
    /* 
     This is a method using a constructor to create an object called song.
     It has no return value.
    */
    public Song(String sName, String aName, int pCount)
    {
        this.songName = sName;
        this.creatorName = aName;
        this.timesplayedCount=pCount;
    }
    
    /* 
     This gets the method which will get the name of the song.
     @return - String representing the name of the song.
    */
    public String getSongName()
    {
        return songName;
    }

    /* 
     The method that gets the creators name for the song so it contains the
     song name and creator aka artist.
     @return - This string represents the name of the songs creator.
    */
    public String getCreatorName()
    {
        return creatorName;
    }

    /* Method to get the amount of times the song has been played.
     @return - This string represents the amount of times the song has been
     played.
    */
    public int gettimesplayedCount()
    {
        return timesplayedCount;
    }

    /* This method will update the song name for the song.
    @return - this is a void so it will not return a value.
    */
public void setSongName(String sName)
{
    this.songName = sName;
}

/* This method will update the creators name for the song.
 @return - this is also void so it will not return a value.
*/
public void setCreatorName(String aName)
{
    this.creatorName = aName;
}

/*
    this method updates the play count for a song
    @return - yet another void so no value is returned
  */
  public void settimesplayedCount(int pCount)
  {
    this.timesplayedCount = pCount;
  }

  /**
    This method will print details of a song
  */
  public void printSong()
  {
    System.out.println(songName + ","+ creatorName + "," + timesplayedCount);    
  } 

}