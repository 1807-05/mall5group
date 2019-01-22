package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description: 骚骚的🐏
 * @Author: 杨
 * @Date: 2019/1/22 11:35
 */
@Data
public class MallAttr {





    private Integer Id;        //编号

    private String shxm_mch;   //属性名称

    private String shfqy;      //是否启用

    private Integer flbh2;     //分类编号2

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chjshj;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getShxm_mch() {
        return shxm_mch;
    }

    public void setShxm_mch(String shxm_mch) {
        this.shxm_mch = shxm_mch;
    }

    public String getShfqy() {
        return shfqy;
    }

    public void setShfqy(String shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getFlbh2() {
        return flbh2;
    }

    public void setFlbh2(Integer flbh2) {
        this.flbh2 = flbh2;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    @Override
    public String toString() {
        return "MallAttr{" +
                "Id=" + Id +
                ", shxm_mch='" + shxm_mch + '\'' +
                ", shfqy='" + shfqy + '\'' +
                ", flbh2=" + flbh2 +
                ", chjshj=" + chjshj +
                '}';
    }
}
