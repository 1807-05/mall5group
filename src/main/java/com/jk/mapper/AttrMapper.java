package com.jk.mapper;

import com.jk.bean.Attr;
import com.jk.bean.Value;

import java.util.List;

public interface AttrMapper {

    //查询attr表
    List<Attr> queryAttr(Attr attr);

    //查询value表
    List<Value> AttrByIdgetAttrValueName(Integer id);
}
