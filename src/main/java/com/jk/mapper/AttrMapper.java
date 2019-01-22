package com.jk.mapper;

import com.jk.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttrMapper {

    //查询attr表
    List<Attr> queryAttr(Attr attr,Page page);

    //查询value表
    List<Value> AttrByIdgetAttrValueName(Integer id);

    //新增attr表
    void addAttr(QueryParam queryParam);

    //新增value表
    void addAttrValue(@Param("list") List<MallValue> attr_value, @Param("tempid") Integer tempid);

    //登陆
    User login(User user);

}
