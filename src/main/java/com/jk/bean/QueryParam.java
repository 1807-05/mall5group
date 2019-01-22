package com.jk.bean;

import lombok.Data;

import java.util.List;

@Data
public class QueryParam {



    private List<Value> value;//用来储存批量增加的对象
    private String shxm;//用来储存批量增加的属性名
    private Integer pid;

    public List<Value> getValue() {
        return value;
    }

    public void setValue(List<Value> value) {
        this.value = value;
    }

    public String getShxm() {
        return shxm;
    }

    public void setShxm(String shxm) {
        this.shxm = shxm;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "value=" + value +
                ", shxm='" + shxm + '\'' +
                ", pid=" + pid +
                '}';
    }
}
