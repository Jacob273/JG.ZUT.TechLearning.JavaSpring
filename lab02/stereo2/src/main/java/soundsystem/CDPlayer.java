package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlayer {
  
	@Autowired
	private CompactDisc compactDisc;

	  public CDPlayer() {
	  }
	
	public void setcompactDisc(CompactDisc compactDisc){
		this.compactDisc = compactDisc;
	}
	
	public CompactDisc getCompactDisc(){
		return compactDisc;
	}

  public void play() {
	  compactDisc.play();
  }

}
