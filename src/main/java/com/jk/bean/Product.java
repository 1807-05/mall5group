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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getShp_mch() {
    return shp_mch;
  }

  public void setShp_mch(String shp_mch) {
    this.shp_mch = shp_mch;
  }

  public String getShp_tP() {
    return shp_tP;
  }

  public void setShp_tP(String shp_tP) {
    this.shp_tP = shp_tP;
  }

  public Integer getFlbh1() {
    return flbh1;
  }

  public void setFlbh1(Integer flbh1) {
    this.flbh1 = flbh1;
  }

  public Integer getFlbh2() {
    return flbh2;
  }

  public void setFlbh2(Integer flbh2) {
    this.flbh2 = flbh2;
  }

  public Integer getPp_id() {
    return pp_id;
  }

  public void setPp_id(Integer pp_id) {
    this.pp_id = pp_id;
  }

  public Date getChjshj() {
    return chjshj;
  }

  public void setChjshj(Date chjshj) {
    this.chjshj = chjshj;
  }

  public String getShp_msh() {
    return shp_msh;
  }

  public void setShp_msh(String shp_msh) {
    this.shp_msh = shp_msh;
  }

  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public String getPinpai() {
    return pinpai;
  }

  public void setPinpai(String pinpai) {
    this.pinpai = pinpai;
  }

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", shp_mch='" + shp_mch + '\'' +
            ", shp_tP='" + shp_tP + '\'' +
            ", flbh1=" + flbh1 +
            ", flbh2=" + flbh2 +
            ", pp_id=" + pp_id +
            ", chjshj=" + chjshj +
            ", shp_msh='" + shp_msh + '\'' +
            ", name1='" + name1 + '\'' +
            ", name2='" + name2 + '\'' +
            ", pinpai='" + pinpai + '\'' +
            '}';
  }
}
