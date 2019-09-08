package com.hadley.a380;

import junit.framework.Assert;

import org.junit.Test;

public class HelloActionTest {

	@Test
	public void testGetNameByA() {
		HelloAction hat = new HelloAction();
		String rs = hat.getName(0);
		Assert.assertEquals("A", rs);
	}
	
	@Test
	public void testGetNameByB() {
		HelloAction hat = new HelloAction();
		String rs = hat.getName(1);
		Assert.assertEquals("B", rs);
	}

}
