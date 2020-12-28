package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(* concert.Woodstock*.perform())")
	public void perform() {	
	}
	
	@Before("perform()")
	public void silenceCellPhones() {
		System.out.println("Wylaczenie telefonow");
	}

	@Before("perform()")
	public void takeSeats() {
		System.out.println("Zajecie miejsc");
	}

	@AfterReturning("perform()")
	public void applause() {
		System.out.println("Brawa i oklaski!!!");
	}

	@AfterThrowing("perform()")
	public void demandRefund() {
		System.out.println("Domaganie sie zwrotu za bilety");
	}
}