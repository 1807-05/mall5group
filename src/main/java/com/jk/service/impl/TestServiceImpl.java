package com.jk.service.impl;

import com.jk.bean.*;
import com.jk.mapper.TestMapper;
import com.jk.service.TestService;
import jdk.internal.util.xml.impl.Attrs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    //四表新增
    @Override
    public void addUser(Gather gather) {

        testMapper.addClass1(gather.getClass_1());
        testMapper.addClass2(gather.getClass_2());
        testMapper.addTmclass(gather.getTm_class());
        testMapper.addTrademark(gather.getTrade_mark());

    }

    @Override
    public List<Class_1> getClass1() {

        return testMapper.getClass1();
    }

    @Override
    public List<Class_2> getClass2(Integer flbh1) {
        return testMapper.getClass2(flbh1);
    }

    @Override
    public List<Trade_mark> getMark(Integer flbh1) {
        List<Integer> number = testMapper.getTmClass(flbh1);
        List<Trade_mark> trade_marks = new ArrayList<>();
        for (Integer id : number) {
                    Trade_mark Ob=testMapper.getMark(id);
                    trade_marks.add(Ob);
        }
            return trade_marks;
    }

    @Override
    public List<Attr> getCheckbox(Integer flbh1) {
        List<Integer> number = testMapper.getProduct(flbh1);
        List<Attr> attrs = new ArrayList<>();
        for (Integer flbh2 : number) {
            attrs =testMapper.getAllCheckbox(flbh2);
        }
         return   attrs;
    }

    @Override
    public List querythis(Integer ids) {
        return testMapper.querythis(ids);
    }

    @Override
    public void addsku(CopyMallSku mallSku) {
        Product product = new Product();
        //商品新增
        product.setShp_mch(mallSku.getSku_mch());
        product.setChjshj(new Date());
        testMapper.addProduct(product);
        Integer max=testMapper.selectKey();

        //库存新增
        MallSku mallSku1 = new MallSku();
        mallSku1.setShp_id(max);
        mallSku1.setJg(mallSku.getJg());
        mallSku1.setChjshj(new Date());
        mallSku1.setKc(mallSku.getKc());
        mallSku1.setSku_mch(mallSku.getSku_mch());
        testMapper.addMallSku(mallSku1);

    }
}