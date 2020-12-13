package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

public class CDPlayer implements MediaPlayer {
	
	@Autowired
	private CompactDisc cd;

	public CDPlayer() {
	}

	public void play() {
		cd.play();
	}
	
	public int trackCount() {
		return cd.trackCount();
	}
	
	public List<String> getTrackTitles(){
		return cd.getTrackTitles();
	}

}
