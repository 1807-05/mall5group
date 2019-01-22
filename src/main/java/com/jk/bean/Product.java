package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Product {
  private  Integer     id;
  private   String     shp_mch;
  private   String     shp_tP;
  private    Integer   flbh1;
  private   Integer    flbh2;
  private   Integer    pp_id;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date         chjshj=new Date();
  private   String    shp_msh;
  private   String     name1;
  private   String     name2;
  private   String     pinpai;





}
