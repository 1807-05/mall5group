package com.jk.mapper;

import com.jk.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
  List<Product> queryShop();


  void addPro(Product pro);

  

  Product getPro(String shp_mch);

  void addPho(@Param("id") Integer id, @Param("name") String s);
}
