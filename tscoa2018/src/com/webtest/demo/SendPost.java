package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class SendPost extends BaseTest{
	@Test(priority=0)
	public void Tz() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi();
	}
	@Test(priority=1)
	public void Tz2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi2("火箭队fighting","火箭队加油！");
//		assertTrue(webtest.ifContains("版块不能为空"));
	}
	@Test(priority=2)
	public void Tz3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi3("火箭队加油！");
//		assertTrue(webtest.ifContains("标题不能为空"));
	}
	@Test(priority=3)
	public void Tz4() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi4("火箭队fighting");
//		assertTrue(webtest.ifContains("内容不能为空"));
	}
	@Test(priority=4)
	public void Tz5() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi5("火箭队fighting","火箭队加油！");
//		assertTrue(webtest.ifContains("帖子信息操作成功"));
	}
	@Test(priority=5)
	public void Tz6() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi6();
	}
}
