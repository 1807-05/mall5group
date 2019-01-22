package com.jk.bean;

import lombok.Data;

import java.util.List;

@Data
public class QueryParam extends MallAttr {

    private List<MallValue> attr_value;//用来储存批量增加的对象
    private Integer tempid;

    public List<MallValue> getAttr_value() {
        return attr_value;
    }

    public void setAttr_value(List<MallValue> attr_value) {
        this.attr_value = attr_value;
    }

    public Integer getTempid() {
        return tempid;
    }

    public void setTempid(Integer tempid) {
        this.tempid = tempid;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "attr_value=" + attr_value +
                ", tempid=" + tempid +
                '}';
    }
}
