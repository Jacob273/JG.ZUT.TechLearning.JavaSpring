package edu.zut.spring.service;

import java.util.ArrayList;

public class OrLogicImpl implements IBaseLogic {

	private ArrayList<Integer> _inputs;
	private Integer _output;
	
	public OrLogicImpl() {
		_inputs = new ArrayList<Integer>();
	}
	
	@Override
	public void Evaluate() {
		Integer result = 0;
		for(Integer input : _inputs)
		{
			result |= input;
		}
		_output = result;
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

}
