package com.jk.mapper;

import com.jk.bean.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {


    void addClass1(Class_1 class_1);

    void addClass2(Class_2 class_2);

    void addTmclass(Tm_class tm_class);

    void addTrademark(Trade_mark trade_mark);

    @Select("select * from t_mall_class_1 ")
    List<Class_1> getClass1();

    @Select("select * from t_mall_class_2 where flbh1=#{flbh1}")
    List<Class_2> getClass2(Integer flbh1);

    @Select("select pp_id from t_mall_tm_class where flbh1=#{flbh1}")
    List<Integer> getTmClass(Integer flbh1);

    @Select("select * from t_mall_trade_mark where id=#{id}")
    Trade_mark getMark(Integer id);

    @Select("select flbh2 from t_mall_product where flbh1=#{flbh1}")
    List<Integer> getProduct(Integer flbh1);

    @Select("select * from t_mall_attr where flbh2=#{flbh2}")
    List<Attrs> getAllCheckbox(Integer flbh2);

    List querythis(Integer ids);

    void addProduct(Product product);

    void addMallSku(MallSku mallSku1);

    @Select("select max(id) from t_mall_product ")
    Integer selectKey();
}
