package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description: 骚骚的🐏
 * @Author: 杨
 * @Date: 2019/1/22 11:36
 */
@Data
public class MallValue {
    private Integer Id;
    private String shxzh;
    private String shfqy;
    private Integer shxm_id;
    private String shxzh_mch;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chjshj;

}
