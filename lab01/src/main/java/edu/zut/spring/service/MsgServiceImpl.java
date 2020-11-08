package edu.zut.spring.service;

public class MsgServiceImpl implements MsgService {
	private String _message;
	
	public void say() {
		System.out.println(_message);
	}

	@Override
	public void setMessage(String message) {
		_message = message;
		
	}

	@Override
	public void clean() {
		_message = "";
	}

}
