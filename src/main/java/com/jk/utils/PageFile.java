/** 
 * <pre>项目名称:SP-SS-HH-01 
 * 文件名称:PageFile.java 
 * 包名:com.jk.kb.utils 
 * 创建日期:2018-10-18下午3:08:16 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

import java.util.List;
public class PageFile {
	   //每页的条数
	  private Integer pageSize;
	   //当前页 
	   private Integer pageNow;
	   //最大的页数
	   private Integer countPage;
	   //最大的行数
	   private Integer countItem;
	  //构造方法
	
	public PageFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	//先条数，页数，总条数。---------比需对应与后台Service
	public PageFile(Integer pageSize, Integer pageNow,
			Integer countItem) {
		super();
		//进行判断-------用户没选择 ，默认是第一页，
		this.pageNow =pageNow == null?1:pageNow;
		//展示条数
		this.pageSize = pageSize==null?4:pageSize;
		//条数
		this.countItem = countItem;
		//判断页数
		int countItems= countItem/this.pageSize;
		if(countItem%this.pageSize>0){	
			countItems++;
		}
		//对象赋值。总页数
		this.countPage=countItems;
		//判断页数不能大于最大页，不得小于1，否则返回首页；
		if(this.pageNow > this.countPage || this.countPage<=0){
			this.pageNow=1;		
		}	
	}
	private List list;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public Integer getCountPage() {
		return countPage;
	}

	public void setCountPage(Integer countPage) {
		this.countPage = countPage;
	}

	public Integer getCountItem() {
		return countItem;
	}

	public void setCountItem(Integer countItem) {
		this.countItem = countItem;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	//分页开始的条数，
	public Integer getBegin() {
		int start = (pageNow - 1) * pageSize+1;
		return start;
	}	
}
