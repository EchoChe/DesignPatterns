package main.java.log;

public class FileLog extends Log {
	public FileLog() {
		System.out.println("Init FileLog");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("destructor FileLog");
	}
	
	@Override
	public String WriteLog() {
		String string = "write to class FileLog";
		return string;
	}
	
}
