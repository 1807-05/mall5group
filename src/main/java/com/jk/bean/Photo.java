package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Data
public class Photo {

  private  Integer id;
  private  String   zy;
  private  Integer shp_id;

  private String  url ;


}
