package com.api.core;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.api.core.BaseTest;
import com.api.util.Log;

public class ApiListener extends TestListenerAdapter{
	
	@Override
	  public void onTestFailure(ITestResult tr) {
		  
		  Log.error(tr.getInstance()+"-"+tr.getName()+"运行失败");
		  BaseTest db = (BaseTest) tr.getInstance();
		  
	}		
			//把测试结果美化
			//把测试结果发送邮件
}