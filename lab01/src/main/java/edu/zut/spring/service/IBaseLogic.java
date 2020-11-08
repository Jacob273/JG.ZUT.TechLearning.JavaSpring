package edu.zut.spring.service;
import java.util.ArrayList; 

public interface IBaseLogic {
	
	public void SetInputs(ArrayList<Integer> inputList);
	public ArrayList<Integer> GetInputs();
	public void AddInput(Integer input);
	public void Clear();
	public void Evaluate();
	public Integer GetOutput();
	
}
