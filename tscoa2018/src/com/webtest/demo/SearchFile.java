package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class SearchFile extends BaseTest{
	@Test(priority=0)
	public void Search4() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.search4();
//		assertTrue(webtest.ifContains("请输入要查询的文件名称"));
	}
	@Test(priority=1)
	public void Search5() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.search5("1.0 软件测试基础课程回顾");
	}
	@Test(priority=2)
	public void Search6() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.search6("lalala");
		
	}
}
