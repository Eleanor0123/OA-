package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class DeleteKnowLedge extends BaseTest{
	@Test(priority=0)
	public void DeleteKn() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletekn();
//		assertTrue(webtest.ifContains("知识信息删除成功"));
	}
	@Test(priority=1)
	public void Deletekn2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletekn2();
//		assertTrue(webtest.ifContains("请至少选中一条帖子"));
	}
}
