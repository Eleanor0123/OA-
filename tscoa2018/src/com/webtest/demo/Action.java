package com.webtest.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Action {
	private WebDriverEngine webtest;
	  public Action(WebDriverEngine webtest) {
		  this.webtest=webtest;
	  }
	  //登录OA系统
	  public void login(String username,String password) throws IOException
	  {
		  webtest.open(ReadProperties.getPropertyValue("base_url"));
		  webtest.type("name=username", username);
		  webtest.type("name=password", password);
		  webtest.click("class=loginBtn");

	  }
	  //1.进入“知识交流”板块
	  public void knowledge() throws IOException 
	  {
		  webtest.click("id=_M9");
		    
	  }
	  //2.查看“知识交流”的各个模块
	  public void others() throws IOException, InterruptedException 
	  {
		  webtest.click("link=知识管理");
		  webtest.click("link=_MP151");
		  webtest.click("link=_MP150");
		  webtest.click("link=下载管理");
		  webtest.click("link=网络硬盘");
		  webtest.click("link=公共文件柜");
		  webtest.click("link=规章制度");
		  webtest.click("link=电子期刊");
		  webtest.click("link=报表管理");
	  }
	  //3.发布信息时未填写标题
	  public void message(String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
		  webtest.click("class=ke-iframe");
	      webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='保存']");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	  //4.发布信息时未填写内容
	  public void message2(String title) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
		  webtest.typeAndClear("xpath=//input[@class='BigInput']",title);
		  webtest.click("xpath=//input[@value='保存']");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	  //5.填写主题和内容发布帖子
	  public void message3(String title,String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
		  webtest.typeAndClear("xpath=//input[@class='BigInput']",title);
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='保存']");
		  webtest.leaveFrame();
	  }
	  //6.输入帖子主题查询已发布的知识
	  public void search(String tname) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.type("xpath=//input[@name='title']",tname);
		  webtest.click("xpath=//button[@id='do_search']");
		  webtest.leaveFrame();
	  }
	  //7.输入帖子日期查询已发布的知识
	  public void search2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='vstartdate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,5);']");
		  webtest.click("xpath=//input[@name='venddate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,6);']");
		  webtest.click("xpath=//button[@id='do_search']");
		  webtest.leaveFrame();
	  }
	  //8.输入帖子主题和日期查询已发布的知识
	  public void search3(String tname) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.type("xpath=//input[@name='title']",tname);
		  webtest.click("xpath=//input[@name='vstartdate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,5);']");
		  webtest.click("xpath=//input[@name='venddate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,6);']");
		  webtest.click("xpath=//button[@id='do_search']");
		  webtest.leaveFrame();
	  }
	 // 9.选中并删除已发布的知识（清理数据）
	  public void deletekn() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("xpath=//button[@action='cancel_concern']");
		  webtest.leaveFrame();
	  }
	  //10.未选中删除已发布的知识（清理数据）
	  public void deletekn2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='cancel_concern']");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	  //11.进入“发布帖子”模块
	  public void tiezi() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=知识管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("id=_MP151");
		  webtest.leaveFrame();
	  }
	  //12.验证添加论坛板块功能
	  public void forum(String forumtitle) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP149");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=+增加新版块");
		  webtest.click("xpath=//input[@name='newname[]']");
		  webtest.type("xpath=//input[@name='newname[]']",forumtitle);
		  webtest.click("xpath=//input[@value='保存']");
	      webtest.leaveFrame();
	  }
	  //13.验证删除论坛板块功能
	  public void forum2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP149");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[contains(@href,'id=6')]");
        webtest.leaveFrame();
	  }
	  //14.验证更改论坛板块类型功能
	  public void forum3() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP149");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='type[5]']");
		  webtest.click("xpath=//option[@value='2']");
		  webtest.click("xpath=//input[@value='保存']");
        webtest.leaveFrame();
	  }
	  //15.发布帖子未选择版块
	  public void tiezi2(String tztitle,String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",tztitle);
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='保存']");
		  webtest.alertAccept();
        webtest.leaveFrame();	  
	  }
	  //16.发布帖子未填写标题
	  public void tiezi3(String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//select[@name='bbsclass']");
		  webtest.click("xpath=//option[@value='5']");
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='保存']");
		  webtest.alertAccept();
        webtest.leaveFrame();
	  }
	//17.发布帖子未填写内容
	  public void tiezi4(String title) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//select[@name='bbsclass']");
		  webtest.click("xpath=//option[@value='5']");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",title);
		  webtest.click("xpath=//input[@value='保存']");
		  webtest.alertAccept();
        webtest.leaveFrame();
	  }
	//18.验证发布帖子功能
	  public void tiezi5(String title,String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//select[@name='bbsclass']");
		  webtest.click("xpath=//option[@value='5']");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",title);
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='保存']");
        webtest.leaveFrame();
	  }
	  //19.验证帖子列表中直接发布新帖功能
	  public void tiezi6() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP150");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
        webtest.leaveFrame();
	  }
	  //20-23同上
	  //24.25无法定位元素
	  //26.验证重命名文件的功能
	  public void rename(String ceshi) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[(@id='8')]");
		  webtest.click("xpath=//input[@name='filename']");
		  webtest.typeAndClear("xpath=//input[@name='filename']",ceshi);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //27.验证批量删除文件功能
	  public void deletefile() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("link=批量删除");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	  //28.未选中文件，无法批量删除文件
	  public void deletefile2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=批量删除");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	  //29.选中并成功删除全部文件
	  public void deletefile3() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=全选");
		  webtest.click("link=批量删除");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	  //30.给共享人员成功共享文件（未成功，没有网址无法定位）
	  public void share() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("link=更多操作");
		  webtest.click("link=共享");
		  webtest.click("link=+选择人员");
		  webtest.click("xpath=//img[@id='tree_1_cb']");
		  webtest.click("xpath=//input[@value='确定']");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //31.32同理未成功执行
	  //33.新建文件夹名称不能为空
	  public void newfile() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=新建文件夹");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //34.验证文件夹已存在后新建文件夹功能
	  public void newfile2(String newtitle) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=新建文件夹");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.type("xpath=//input[@id='title']",newtitle);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //35.新建文件夹名称为空格
	  public void newfile3(String kongge) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=新建文件夹");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.type("xpath=//input[@id='title']",kongge);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	//36.验证新建文件夹功能
	  public void newfile4(String sname) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=新建文件夹");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.type("xpath=//input[@id='title']",sname);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //37.验证重命名文件夹的功能
	  public void newfile5(String mm) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[(@title='huojian')]");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.typeAndClear("xpath=//input[@id='title']",mm);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	//38.验证删除文件夹的功能
	  public void deletefile4() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[@onclick='DeleteFile.document_type(5);']");
		  webtest.alertAccept();
		  webtest.leaveFrame();
	  }
	//39.验证查询文件能否为空
	  public void search4() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=查询");
		  webtest.leaveFrame();
	  }
	//40.验证查询文件的功能
	  public void search5(String titlename) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",titlename);
		  webtest.click("link=查询");
		  webtest.leaveFrame();
	  }
	//41.查询文件输入不存在的文件名
	  public void search6(String titlename) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",titlename);
		  webtest.click("link=查询");
		  webtest.leaveFrame();
	  }
	  //42.验证界面中“移动文件”的功能
	  public void move() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("link=更多操作");
		  webtest.click("link=移动");
		  webtest.click("xpath=//select[@name='typeid']");
		  webtest.click("xpath=//option[@value='1']");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //43.未选中文件而点击“更多操作-移动文件”
	  public void move2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=下载管理");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=更多操作");
		  webtest.click("link=移动");
		  webtest.click("xpath=//select[@name='typeid']");
		  webtest.click("xpath=//option[@value='1']");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }


}
