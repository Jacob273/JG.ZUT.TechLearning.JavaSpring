 package soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/jg-context.xml");
		MediaPlayer player = context.getBean(MediaPlayer.class);
		player.play();
		context.close();
	}

}
