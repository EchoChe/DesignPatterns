package main.java.log;

import javafx.beans.value.WritableLongValue;

public abstract class Log {
	public Log() {
		System.out.println("Init class Log ");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("class Log Destructor");
	} 

	public String WriteLog() {
		String string = "write to class Log";
		return string;
	}
}
