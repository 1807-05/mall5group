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

}
