package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Front_Login_Test extends BaseTest{
	
	@Test(priority=1)
	public void LoginSuccess() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
    	assertTrue(webtest.ifContains("ÍË³ö"));
	}
	@Test(priority=0)
	public void LoginFail() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "654321");
		assertTrue(webtest.ifContains("µÇÂ¼Ê§°Ü111 "));
	}
	
}
