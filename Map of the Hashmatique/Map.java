import java.util.HashMap;
import java.util.Set;

public class Map {

  public static void main(String[] args) {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Song1", "Lyrics1");
    trackList.put("Song2", "Lyrics2");
    trackList.put("Song3", "Lyrics3");
    trackList.put("Song4", "Lyrics4");

    System.out.println(trackList.get("Song4"));

    for (HashMap.Entry<String,String> track : trackList.entrySet()) {
        System.out.println(track.getKey()+track.getValue());
    }
  }
}
