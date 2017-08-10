
import java.util.ArrayList;
import java.util.List;


public class Movie {

	
	public static void main(String[] args) {
		List <String> myMovies= new ArrayList<String>();

		myMovies.add("Dunkirk");
		myMovies.add("Valerian");
		myMovies.add("Justice League");
	}

   
    public Movie()
    {
        tracks = new ArrayList<Track>();
        player = new MusicPlayer();
        reader = new TrackReader();
        readLibrary("audio");
        System.out.println("Music library loaded. " + getNumberOfTracks() + " tracks.");
        System.out.println();
    }
  
    public void addMovie(String movie)
    {
        movies.add(new ArrayList(movie));
    }
    
   
    public void playTrack(int index)
    {
        if(indexValid(index)) {
            Track track = tracks.get(index);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getMovieType() + " - " + track.getActor());
        }
    }
    
    
    public int getNumberOfTracks()
    {
        return tracks.size();
    }
    
    
    public void listTrack(int index)
    {
        System.out.print("Track " + index + ": ");
        Track track = tracks.get(index);
        System.out.println(track.getDetails());
    }
    
   
    public void listAllTracks()
    {
        System.out.println("Track listing: ");

        for(Track track : tracks) {
            System.out.println(track.getDetails());
        }
        System.out.println();
    }
    
   
    public void listByActor(String actor)
    {
        for(Track track : tracks) {
            if(track.getArtist().contains(actor)) {
                System.out.println(track.getDetails());
            }
        }
    }
    
   
    public void removeMovie(int id)
    {
        if(indexValid(index)) {
            tracks.remove(index);
        }
    }
    
    /**
     * Play the first track in the collection, if there is one.
     */
    public void playFirst()
    {
        if(tracks.size() > 0) {
            player.startPlaying(tracks.get(0).getFilename());
        }
    }
    
  
    
    private void readLibrary(String folderName)
    {
        ArrayList<Track> tempTracks = reader.readTracks(folderName, ".mp3");

        // Put all thetracks into the organizer.
        for(Track track : tempTracks) {
            addTrack(track);
        }
    }
}
