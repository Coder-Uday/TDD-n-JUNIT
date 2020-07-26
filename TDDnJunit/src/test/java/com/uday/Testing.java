package com.uday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	UdayTest c=new UdayTest();

	@Test
	public void testAccept() {
	assertEquals("UDAY",c.accept("CUDAY"));	
	}


	@Test
	public void test() {
	assertEquals("CDA",c.accept("AACDA"));	
	}
    

	@Test
	public void test1() {
	assertEquals("",c.accept(""));	
	}
	@Test
	public void test2() {
	assertEquals("AAA",c.accept("AAABAA"));	
	}

	@Test
	public void test3() {
	assertEquals("BCD",c.accept("BACD"));	
	}

	@Test
	public void test4() {
	assertEquals("BBAA",c.accept("BBAA"));	
	}
	
	@Test
	public void test5() {
	assertEquals("",c.accept("AA"));	
	}


}
