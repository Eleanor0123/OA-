package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class SearchKnowLegde extends BaseTest{
	@Test(priority=0)
	public void Search() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.search("가가가");
	}
	@Test(priority=1)
	public void Search2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.search2();
	}
	@Test(priority=2)
	public void Search3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.search3("가가가");
	}
}
