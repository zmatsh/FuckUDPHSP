// Copyright (c) 2015 firsh.ME
package fuck.gfw.rudp;

public class ReceivePingException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5199731243611486228L;
	String message;
	ReceivePingException(String message){
		this.message=message;
	}
	@Override
	public void printStackTrace(){
		//#MLog.println("Ping寮傚父 "+message);
	}
}
