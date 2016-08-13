package main.java.factory;

import main.java.log.Log;

public abstract class LogFactory {
	public Log createLog() {
		Log log = new Log() {};
		return log;
	} 
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}
