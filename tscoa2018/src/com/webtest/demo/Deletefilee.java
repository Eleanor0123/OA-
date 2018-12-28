package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Deletefilee extends BaseTest{
	@Test(priority=0)
	public void Deletefile() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletefile();
//		assertTrue(webtest.ifContains("确定要删除文件吗"));
	}
	@Test(priority=1)
	public void Deletefile2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletefile2();
//		assertTrue(webtest.ifContains("请至少选中一个文件"));
	}
	@Test(priority=2)
	public void Deletefile3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletefile3();
//		assertTrue(webtest.ifContains("确定要删除文件吗"));
	}
}
