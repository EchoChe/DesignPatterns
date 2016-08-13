package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.log.DatabaseLog;
import main.java.log.FileLog;
import main.java.log.Log;

public class LogTest {

	@Test
	public void logTest() {
		Log log = new Log(){};
		Assert.assertEquals("write to class Log", log.WriteLog());
	}
	
	@Test
	public void fileLogTest() {
		FileLog fileLog = new FileLog() {};
		Assert.assertEquals("write to class FileLog", fileLog.WriteLog());
	}
	
	@Test
	public void dataBaseLogTest() {
		DatabaseLog dataBaseLog = new DatabaseLog() {};
		Assert.assertEquals("write to class DatabaseLog", dataBaseLog.WriteLog());
	}
}
