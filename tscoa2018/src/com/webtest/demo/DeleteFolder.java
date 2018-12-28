package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
//@Listeners(WebTestListener.class)
public class DeleteFolder extends BaseTest{
	@Test
	public void Deletefile4() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletefile4();
//		assertTrue(webtest.ifContains("确定要删除文件夹及里面的文件吗？"));
		
	}
}
