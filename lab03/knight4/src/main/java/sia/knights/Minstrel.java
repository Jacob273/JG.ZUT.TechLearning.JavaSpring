package sia.knights;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Minstrel {
 
	@Pointcut("execution(* sia.knights.Quest.embark(Horse)) && args(horse)")
	public void startQuest(Horse horse) {
	}
 
	@Before("startQuest(horse)")
	public void singBeforeQuest(Horse horse) {
		String horseName = horse.getClass().getSimpleName();
		System.out.println("Tra la la; Jakis rycerz i jego kon " + horseName + " sa dzielni!");
	}
 
	@After("startQuest(horse)")
	public void singAfterQuest(Horse horse) {
		String horseName = horse.getClass().getSimpleName();
		System.out.println("Hip hip hura; Dzielny rycerz i jego kon " + horseName + " wypelnili, misje!");
	}
 
}