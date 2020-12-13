package soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDPlayerMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(
				CDPlayerConfig.class);
		
		context.close();
		
		CompactDisc cd = new SgtPeppers();
		MediaPlayer player = new CDPlayer(cd);
		player.play();
	}

}
