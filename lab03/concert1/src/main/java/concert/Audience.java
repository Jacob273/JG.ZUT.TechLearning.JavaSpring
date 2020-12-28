package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Before("execution(* concert.Woodstock.perform())")
	public void silenceCellPhones() {
		System.out.println("Wylaczenie telefonow");
	}

	@Before("execution(* concert.Woodstock.perform())")
	public void takeSeats() {
		System.out.println("Zajecie miejsc");
	}

	@AfterReturning("execution(* concert.Woodstock.perform())")
	public void applause() {
		System.out.println("Brawa i oklaski!!!");
	}

	@AfterThrowing("execution(* concert.Woodstock.perform())")
	public void demandRefund() {
		System.out.println("Domaganie sie zwrotu za bilety");
	}
}