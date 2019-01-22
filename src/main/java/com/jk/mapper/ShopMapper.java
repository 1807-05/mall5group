package com.jk.mapper;

import com.jk.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
  List<Product> queryShop();

 /* void addPho(@Param("name") String shop_tp, @Param("id") Integer id);*/

  void addPro(Product pro);
}
