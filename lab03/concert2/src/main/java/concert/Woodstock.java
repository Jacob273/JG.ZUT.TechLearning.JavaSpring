package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class Woodstock implements Performance {

	@Override
	public void perform() {
		System.out.println("Koncert Woodstock...");
	}

}
