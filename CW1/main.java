
package CW1;

public class main
{
public static void main(String[] args) 
  {
    createSongs();
  }

  /**
    This method will setup sample songsand test they are stored
    This is a void so no values are returned.
  */
  public static void createSongs()
  {
     //This will create unique songs for the playlist.
     Song song1 = new Song("Heat Haze Shadow","Tekken 7 OST",100000);
     Song song2 = new Song("Great Cat's Village R","Melty Blood Type Lumina OST",5000);
     Song song3 = new Song("Chemical Love","Kevin&Cherry",10);
     Song song4 = new Song("Killing My Love","Initial D",500);
     Song song5 = new Song("Push It To The Limit","Scarface",49000);
     Song song6 = new Song("Not Ready To Die","Avenged Sevenfold",115);
     Song song7 = new Song("George Karizaki's No Rider System","George Karizaki",50);
     Song song8 = new Song("24 Hour Cinderella","Yakuza O OST",24);
     Song song9 = new Song("G Corp. Helipad (Night)","Tekken 7 OST",7);
     Song song10 = new Song("Scarlet Police on Ghetto Patrol in 24 Hours","IOSYS",9);
    
     //User input to get details of a song
    String nameOfSong = InputReader.getString("Enter name of song: ");
    String theArtist = InputReader.getString("Enter creator of song: ");
    int plyCount = InputReader.getInt("How many times has the song been played: ");  
    Song song11 = new Song(nameOfSong,theArtist,plyCount);
      
    song1.printSong();
    song2.printSong();
    song3.printSong();
    song4.printSong();
    song5.printSong();
    song6.printSong();
    song7.printSong();
    song8.printSong();
    song9.printSong();
    song10.printSong();
    song11.printSong();
 
    //This will create a playlist and then add 2 songs to it.
 Playlist myPlaylist = new Playlist();
 myPlaylist.addSong(song1);
 myPlaylist.addSong(song2);
 myPlaylist.addSong(song3);
 myPlaylist.addSong(song4);
 myPlaylist.addSong(song5);
 myPlaylist.addSong(song6);
 myPlaylist.addSong(song7);
 myPlaylist.addSong(song8);
 myPlaylist.addSong(song9);
 myPlaylist.addSong(song10);
 myPlaylist.addSong(song11);
 
 //Display size of Playlist
 System.out.println(myPlaylist.sizeOfPlaylist());

 myPlaylist.printHeader();
 myPlaylist.printAllSongs();
 
 myPlaylist.deleteSong(1);
 myPlaylist.printAllSongs();
 System.out.println("=============================");
 myPlaylist.printSelectSongs(6);

}
}
