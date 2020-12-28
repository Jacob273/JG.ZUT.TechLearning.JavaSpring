package concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performance perf = ctx.getBean(Performance.class);
		Performance perf2 = (Performance) ctx.getBean("w2");
		perf.perform();
		perf2.perform();
		ctx.close();
	}
}
