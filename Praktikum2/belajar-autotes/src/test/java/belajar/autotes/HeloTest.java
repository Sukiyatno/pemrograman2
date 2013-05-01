package belajar.autotes;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;


public class HeloTest extends TestCase{
    public HeloTest( String testName ){
        super( testName );
    }
	protected void setUp() throws Exception {
	super.setUp();
	System.out.println("Hello");
	}
	
	protected void tearDown() throws Exception {
	super.tearDown ();
	System.out.println("World");
	}
	
	public void testApp(){
	System.out.println ("Hello World");
	}
	
	public void testAritmetic(){
	int a=7;
	int b=4;
	
	Assert.assertEquals(10, a+b);
	}
}