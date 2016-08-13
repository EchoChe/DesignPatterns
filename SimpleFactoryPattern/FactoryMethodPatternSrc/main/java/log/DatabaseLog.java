package main.java.log;

public class DatabaseLog extends Log {
	public DatabaseLog() {
		System.out.println("Init DatabaseLog");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("destructor DatabaseLog");
	}
	
	@Override
	public String WriteLog() {
		String string = "write to class DatabaseLog";
		return string;
	}
}
