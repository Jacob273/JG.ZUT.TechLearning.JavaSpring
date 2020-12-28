package sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.knights.config.KnightConfig;

public class KnightJavaMain {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = ctx.getBean(Knight.class);
		knight.embarkOnQuest();
		ctx.close();
	}

}
