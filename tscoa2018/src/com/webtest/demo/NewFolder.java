package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class NewFolder extends BaseTest{
	@Test(priority=0)
	public void Newfile() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.newfile();
//		assertTrue(webtest.ifContains("文件夹名称不能为空，请输入"));
	}
	@Test(priority=1)
	public void Newfile2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.newfile2("huojian");
//		assertTrue(webtest.ifContains("文件夹已存在，请重新输入"));
	}
	@Test(priority=2)
	public void Newfile3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.newfile3(" ");
//		assertTrue(webtest.ifContains("文件夹名称不能为空"));
	}
	@Test(priority=3)
	public void Newfile4() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.newfile4("huojian2");
	}
}
