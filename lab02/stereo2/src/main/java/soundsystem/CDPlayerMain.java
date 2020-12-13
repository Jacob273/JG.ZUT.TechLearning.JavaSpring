package soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/jakub-gmur-context.xml");
		MediaPlayer player = context.getBean("mainMediaPlayer", MediaPlayer.class);
		player.play();
		context.close();
	}

}
