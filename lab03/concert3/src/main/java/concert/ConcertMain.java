package concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {
    public static void main(String[] args) {
    	Performance p = new Woodstock();
        p.perform();
    }
}
