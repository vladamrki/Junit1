package com.java.junit.Junit;

import junit.framework.Assert;
import org.junit.Test;
 
public class AppTest {
 
	@Test
	public void testPrintHelloWorld() {
 
		Assert.assertEquals(App.getHelloWorld(), "Hello World");
 
	}
	@Test
	public void testPrintHelloWorld1() {
		 
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
 
	}
 
}