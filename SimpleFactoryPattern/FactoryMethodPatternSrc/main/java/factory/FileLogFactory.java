package main.java.factory;

import main.java.log.FileLog;

public class FileLogFactory extends LogFactory {
	public FileLog createLog() {
		FileLog fileLog = new FileLog() {};
		return fileLog;
	} 
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
