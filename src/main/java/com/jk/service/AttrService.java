package com.jk.service;

import com.jk.bean.Attr;
import com.jk.bean.Page;
import com.jk.bean.QueryParam;
import com.jk.bean.User;

import java.util.List;

public interface AttrService {

    //查询属性列表
    List<Attr> queryAttr(Attr attr,Page page);

    //新增
    void addAttr(QueryParam queryParam);

    //登陆
    User login(User user);

}
