package edu.zut.spring.service;

public class AndLogicImpl extends AbstractLogic {

	@Override
	public void Evaluate() {
		Integer result = _inputs.get(0);
		for(Integer input : _inputs)
		{
			if(input != result)
			{
				result = 0;
				break;
			}
			else if(input == 1)
			{
				result = 1;
			}
		}
		_output = result;
	}

}
