package com.jk.service.impl;

import com.jk.bean.Attr;
import com.jk.bean.Value;
import com.jk.mapper.AttrMapper;
import com.jk.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private AttrMapper attrMapper;

    //查询属性列表
    @Override
    public List<Attr> queryAttr(Attr attr) {
        List<Attr> mallAttrs = attrMapper.queryAttr(attr);
        for (Attr Attr : mallAttrs) {
            List<Value> nameList = attrMapper.AttrByIdgetAttrValueName(Attr.getId());
            String flag="";
            for (Value attr_value : nameList) {
                flag+=attr_value.getShxzh()+attr_value.getShxzh_mch()+"   ";

            }
            Attr.setShxz(flag);
        }

        return mallAttrs;
    }

}
