package edu.zut.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.zut.spring.service.MsgService;
import jg.zut.spring.business.OnOffSwitchImpl;
import jg.zut.spring.service.IBaseLogic;

import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		IBaseLogic orLogic = ctx.getBean("orLogic", IBaseLogic.class);
		IBaseLogic andLogic = ctx.getBean("andLogic", IBaseLogic.class);
		
		
		// Verifying OrLogic
		orLogic.addInput(0);
		orLogic.addInput(0);
		orLogic.addInput(1);
		out.println("Inputs for OR:");
		for(Integer input : orLogic.getInputs())
		{
			out.println(String.format("values: <%s> ", input));
		}
		orLogic.evaluate();
		out.println(String.format("The result of OR evaluation: <%s> ", orLogic.getOutput()));
		
		
		// Verifying AndLogic
		andLogic.addInput(1);
		andLogic.addInput(1);
		out.println("Inputs for AND:");
		for(Integer input : andLogic.getInputs())
		{
			out.println(String.format("values: <%s> ", input));
		}
		andLogic.evaluate();
		out.println(String.format("The result of AND evaluation: <%s> ", andLogic.getOutput()));
		
		
		MsgService msgService1 =  ctx.getBean("msgService", MsgService.class);
		msgService1.setMessage("Setting message 111111111111111");
		
		MsgService msgService2 =  ctx.getBean("msgService", MsgService.class);
		msgService2.setMessage("Setting message 222222222222222");
		
		msgService1.say();
		msgService2.say();
		
		
		OnOffSwitchImpl onOffSwitch = ctx.getBean("onOffSwitch", OnOffSwitchImpl.class);
		onOffSwitch.enable();
		onOffSwitch.disable();
	}

}
