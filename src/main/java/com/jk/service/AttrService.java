package com.jk.service;

import com.jk.bean.Attr;
import com.jk.bean.QueryParam;

import java.util.List;

public interface AttrService {

    //查询属性列表
    List<Attr> queryAttr(Attr attr);

    void addAttr(QueryParam queryParam);
}
