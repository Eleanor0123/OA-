package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Renamefile extends BaseTest{
	@Test
	public void Rename() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.rename("1.4 Ì½Ë÷Ê½Èí¼ş²âÊÔ¡ª¡ªÂôµã²âÊÔ·¨");
	}
}
