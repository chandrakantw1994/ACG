package com.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pages.*;

import junit.framework.Assert;

public class TestCases extends LoginPage
{
	@Test(priority=1, groups= {"Smoke testing"})
	public static void VerifyLoginFunctionality()
	{
		launchBrowser();
		openURL("https://172.16.70.122/");
		performLogin("AutoUser", "tnt1234");
		
		Reporter.log("Login function tested by chandrakant");
	}
	
	@Test(priority=2, groups= {"Smoke testing"})
	public static void VerifyDashboardPageisDispalyed()
	{
		boolean v =DashboardPage.isDashboardDisplayed();
		
		Assert.assertEquals(true, v);
	}
}