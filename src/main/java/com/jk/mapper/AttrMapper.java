package com.jk.mapper;

import com.jk.bean.Attr;
import com.jk.bean.MallValue;
import com.jk.bean.QueryParam;
import com.jk.bean.Value;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttrMapper {

    //查询attr表
    List<Attr> queryAttr(Attr attr);

    //查询value表
    List<Value> AttrByIdgetAttrValueName(Integer id);

    //新增attr表
    void addAttr(QueryParam queryParam);

    //新增value表
    void addAttrValue(@Param("list") List<MallValue> attr_value, @Param("tempid") Integer tempid);
}
