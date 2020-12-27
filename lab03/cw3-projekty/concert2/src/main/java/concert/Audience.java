package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Audience {
	public void silenceCellPhones() {
		System.out.println("Wyłączenie telefonów");
	}

	public void takeSeats() {
		System.out.println("Zajęcie miejsc");
	}

	public void applause() {
		System.out.println("Brawa i oklaski!!!");
	}

	public void demandRefund() {
		System.out.println("Domaganie się zwrotu a bilety");
	}
}