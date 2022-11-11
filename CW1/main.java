
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
     //This will create unique songs for the listOfsongs.
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
    String nameOfSong = InputReader.getString("Enter the name of a song please: ");
    String theArtist = InputReader.getString("Who is the creator of this song: ");
    int songplayCount = InputReader.getInt("How many times has this song been played: ");  
    Song song11 = new Song(nameOfSong,theArtist,songplayCount);
      
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
 
    //This will create a listOfsongs and then add 2 songs to it.
 listOfsongs myListofsongs = new listOfsongs();
 myListofsongs.addSong(song1);
 myListofsongs.addSong(song2);
 myListofsongs.addSong(song3);
 myListofsongs.addSong(song4);
 myListofsongs.addSong(song5);
 myListofsongs.addSong(song6);
 myListofsongs.addSong(song7);
 myListofsongs.addSong(song8);
 myListofsongs.addSong(song9);
 myListofsongs.addSong(song10);
 myListofsongs.addSong(song11);
 
 //Display size of listOfsongs
 System.out.println(myListofsongs.sizeOflistOfsongs());

 myListofsongs.printHeader();
 myListofsongs.printAllSongs();
 


 //deleting a song
 int id = InputReader.getInt("Enter the id of a song you would like to delete:");
 myListofsongs.deleteSong(id);
 myListofsongs.printHeader();
 myListofsongs.printAllSongs();



//finding songs over select number of plays
 int numberOfplays = InputReader.getInt("Please enter a select number of plays:");
 myListofsongs.printSelectSongs(numberOfplays);


}
}
