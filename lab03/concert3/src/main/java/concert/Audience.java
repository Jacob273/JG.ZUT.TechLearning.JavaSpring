package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Around(("execution(* concert.Woodstock*.perform())"))
	public void perform(ProceedingJoinPoint jp){
		try 
		{
			silenceCellPhones();
			takeSeats();
			jp.proceed();
			applause();
		}
		catch(Throwable e)
		{
			demandRefund();
		}
		finally
		{
			
		}
	}
	
	public void silenceCellPhones() {
		System.out.println("Wylaczenie telefonow");
	}

	public void takeSeats() {
		System.out.println("Zajecie miejsc");
	}

	public void applause() {
		System.out.println("Brawa i oklaski!!!");
	}

	public void demandRefund() {
		System.out.println("Domaganie sie zwrotu za bilety");
	}
}