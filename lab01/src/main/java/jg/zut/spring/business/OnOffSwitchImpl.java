package jg.zut.spring.business;

import jg.zut.spring.service.IBaseLogic;

public class OnOffSwitchImpl {

	
	IBaseLogic _baseLogic;
	public OnOffSwitchImpl(IBaseLogic baseLogic){
		_baseLogic = baseLogic;
	}
	
	public void enable() 
	{
		if(_baseLogic.getOutput() == 1)
		{
			System.out.println("Switch can be enabled. Enabling switch....");
		}
	}
	
	public void disable() 
	{
		if(_baseLogic.getOutput() == 0)
		{
			System.out.println("Switch can be disabled. Disabling switch....");
		}
	}
}
