package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class AddForum extends BaseTest{
	@Test(priority=0)
	public void Forum() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.forum("火箭队测试用例2");
//		assertTrue(webtest.ifContains("版块信息操作成功"));
	}
	@Test(priority=1)
	public void Forum2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.forum2();
//		assertTrue(webtest.ifContains("版块信息删除成功"));
	}
	@Test(priority=2)
	public void Forum3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.forum3();
//		assertTrue(webtest.ifContains("版块信息操作成功"));
	}
}
