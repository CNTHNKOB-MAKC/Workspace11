package core.JunitSurefireReport;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest1 {

	 @Test 
	 public void Test_01_AssertionEquals_Positive() {assertEquals("String not the same", "Testing JUnit 4", App.s);}
	 
	 @Test
	 public void Test_02_AssertionEquals_Negative() {assertEquals("String not the same", "Testing JUnit 6", App.s); }
	@Ignore
	 @Test
	 public void Test_03_AssertEquals_Ignoreed() {assertEquals("String not the same ","Testing Junit 3", App.s);}

	@Test
	public void Test_04_AssertSame_Positive() {assertSame("Integer not the same ", 55,App.i);}

}
