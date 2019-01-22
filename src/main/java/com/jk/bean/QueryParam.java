package com.jk.bean;

import lombok.Data;

import java.util.List;

@Data
public class QueryParam extends MallAttr {

    private List<MallValue> attr_value;//用来储存批量增加的对象
    private Integer tempid;

}
