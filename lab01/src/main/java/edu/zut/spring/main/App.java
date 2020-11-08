package edu.zut.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.zut.spring.service.HelloService;
import edu.zut.spring.service.IBaseLogic;
import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		IBaseLogic orLogic = ctx.getBean("orLogic", IBaseLogic.class);
		IBaseLogic andLogic = ctx.getBean("andLogic", IBaseLogic.class);
		
		
		// Verifying OrLogic
		orLogic.AddInput(0);
		orLogic.AddInput(0);
		orLogic.AddInput(1);
		out.println("Inputs for OR:");
		for(Integer input : orLogic.GetInputs())
		{
			out.println(String.format("values: <%s> ", input));
		}
		orLogic.Evaluate();
		out.println(String.format("The result of OR evaluation: <%s> ", orLogic.GetOutput()));
		
		
		// Verifying AndLogic
		andLogic.AddInput(1);
		andLogic.AddInput(1);
		out.println("Inputs for AND:");
		for(Integer input : andLogic.GetInputs())
		{
			out.println(String.format("values: <%s> ", input));
		}
		andLogic.Evaluate();
		out.println(String.format("The result of AND evaluation: <%s> ", andLogic.GetOutput()));
	}

}
