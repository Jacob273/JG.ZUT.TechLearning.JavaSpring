package edu.zut.spring.service;

import java.util.ArrayList;

public abstract class AbstractLogic implements IBaseLogic {
	protected ArrayList<Integer> _inputs;
	protected Integer _output;
	
	public AbstractLogic() {
		_inputs = new ArrayList<Integer>();
		_output = 0;
	}
	
	@Override
	public void SetInputs(ArrayList<Integer> inputList) {
		_inputs = inputList;
	}

	@Override
	public void AddInput(Integer input) {
		_inputs.add(input);
	}

	@Override
	public Integer GetOutput() {
		return _output;
	}

	@Override
	public ArrayList<Integer> GetInputs() {
		return _inputs;
	}
	
	@Override
	public void Clear() {
		if(_inputs != null) {
			_inputs.clear();
		}
	}
	
}
