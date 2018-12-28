package com.api.test;

import static org.testng.Assert.assertEquals;

import org.apache.http.HttpEntity;

import org.apache.http.client.methods.CloseableHttpResponse;

import org.apache.http.client.methods.HttpPost;

import org.apache.http.entity.StringEntity;

import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.impl.client.HttpClients;

import org.apache.http.util.EntityUtils;

import org.testng.annotations.Test;

import com.api.core.HttpDriver;
import com.api.util.ReadPro;

import net.sf.json.JSONObject;

public class PostJsonDemo {

	@Test(priority=0)
	public void LoginBySuccess() throws Exception {
		String url=ReadPro.getPropValue("BaseUrl");
		JSONObject success_user = new JSONObject();
		success_user.element("phoneArea", "86");
		success_user.element("phoneNumber", "20000000000");
		success_user.element("password", "netease123");
		String message=HttpDriver.doPost(url,success_user);
		assertEquals(message, "success");
	}
	@Test(priority=1)
	public void LoginByFail() throws Exception {
		String url=ReadPro.getPropValue("BaseUrl");
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease1234");
		String message=HttpDriver.doPost(url,user);
		assertEquals(message, "success");
		}
}
