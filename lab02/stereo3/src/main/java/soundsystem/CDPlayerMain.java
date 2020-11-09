package soundsystem;

public class CDPlayerMain {

	public static void main(String[] args) {
		CompactDisc cd = new SgtPeppers();
		MediaPlayer player = new CDPlayer(cd);
		player.play();
	}

}
