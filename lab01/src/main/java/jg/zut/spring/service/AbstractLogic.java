package jg.zut.spring.service;

import java.util.ArrayList;

public abstract class AbstractLogic implements IBaseLogic {
	protected ArrayList<Integer> _inputs;
	protected Integer _output;
	
	public AbstractLogic() {
		_inputs = new ArrayList<Integer>();
		_output = 0;
	}
	
	public abstract void evaluate();
	
	@Override
	public void setInputs(ArrayList<Integer> inputList) {
		_inputs = inputList;
	}

	@Override
	public void addInput(Integer input) {
		_inputs.add(input);
	}

	@Override
	public Integer getOutput() {
		return _output;
	}

	@Override
	public ArrayList<Integer> getInputs() {
		return _inputs;
	}
	
	@Override
	public void clear() {
		if(_inputs != null) {
			_inputs.clear();
		}
	}
	
}
