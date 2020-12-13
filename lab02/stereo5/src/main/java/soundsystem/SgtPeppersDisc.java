package soundsystem;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.util.ArrayList; 
import java.util.List; 

@Component
@Profile("test")
public class SgtPeppersDisc implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.print("Playing " + title + " by " + artist);
  }
  
  public int trackCount() {
	  return 1;
  }
  
  public List<String> getTrackTitles(){
	  List<String> list = new ArrayList<String>();
      list.add(title);
	  return list;
  }
  
}
