package edu.zut.spring.service;
import java.util.ArrayList; 

public interface IBaseLogic {
	
	public void setInputs(ArrayList<Integer> inputList);
	public ArrayList<Integer> getInputs();
	public void addInput(Integer input);
	public void clear();
	public void evaluate();
	public Integer getOutput();
	
}
