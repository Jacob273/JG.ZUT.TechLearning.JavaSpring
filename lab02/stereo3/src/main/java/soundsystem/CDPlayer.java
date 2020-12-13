package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  
	@Autowired
	private CompactDisc compactDisc;

	public CDPlayer() {
	}
	
	  public void play() {
	  compactDisc.play();
	  }

}
