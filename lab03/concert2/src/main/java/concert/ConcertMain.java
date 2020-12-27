package concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {
    public static void main(String[] args) {
    	Performance p = new Woodstock2();
    	try {
        p.perform();
    	} catch (RuntimeException re) {
    		System.out.println("Wyjątek: " + re.getMessage());
    	}
    }
}
