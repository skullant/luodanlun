package com.luodanlun.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConfigTest {
	
	@Before
	public void beforeAllTest(){
		System.out.println("*******  test begin :");
	}
	
	@After
	public void afterAllTest(){
		System.out.println("*******  test end !");
	}

	@Test
	public void getValueTest(){
		System.out.println(Config.getValue("user"));
	}
}
