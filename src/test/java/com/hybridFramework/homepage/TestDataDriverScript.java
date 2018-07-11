package com.hybridFramework.homepage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

public class TestDataDriverScript extends TestBase {

	@DataProvider(name = "testData")
	// you can use String[][], but Object can take every thing
	public Object[][] dataSource() {
		return getData("TestData.xlsx", "LoginTestData");

	}

	@Test(dataProvider = "testData")
	public void testLogin(String userName, String password) {
		System.out.println("userName:-" + userName);
		System.out.println("password:-" + password);
	}

}
