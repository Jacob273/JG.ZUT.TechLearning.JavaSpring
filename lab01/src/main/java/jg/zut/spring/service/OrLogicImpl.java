package jg.zut.spring.service;

public class OrLogicImpl extends AbstractLogic {

	@Override
	public void evaluate() {
		Integer result = 0;
		for(Integer input : _inputs)
		{
			result |= input;
		}
		_output = result;
	}

}
