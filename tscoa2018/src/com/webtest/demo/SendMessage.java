package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class SendMessage extends BaseTest{
	@Test(priority=0)
    public void Message() throws Exception  {
	    Action action =new Action(webtest) ;
	    action.login("admin", "123456");
	    action.message("aaaaaa");
//	    assertTrue(webtest.ifContains("标题不能为空"));
    }
	@Test(priority=1)
	public void Message2() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
		action.message2("啊啊啊");
//		assertTrue(webtest.ifContains("内容不能为空"));
	}
	@Test(priority=2)
	public void Message3() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
		action.message3("啊啊啊","aaaaaa");
//		assertTrue(webtest.ifContains("知识信息操作成功"));
	}
}