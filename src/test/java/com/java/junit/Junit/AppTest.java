package com.java.junit.Junit;

import junit.framework.Assert;
import org.junit.Test;
 
public class AppTest {
 
	@Test
	public void testPrintHelloWorld() {
 
		Assert.assertEquals(App.getHelloWorld(), "Helo World");
 
	}
 
}