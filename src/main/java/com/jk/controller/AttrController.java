package com.jk.controller;

import com.jk.bean.Attr;
import com.jk.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("attr")
public class AttrController {

    @Autowired
    private AttrService attrService;

    //跳转属性查询页面
    @RequestMapping("toshuxing")
    public String toshuxing(){
        return "shuxing";
    }

    //查询属性列表
    @ResponseBody
    @RequestMapping("queryAttr")
    public List<Attr> queryAttr(Attr attr) {

        List<Attr> attrList = attrService.queryAttr(attr);

        return attrList;
    }
}
