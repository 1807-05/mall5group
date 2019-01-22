package com.jk.controller;

import com.jk.bean.Attr;
import com.jk.bean.MallValue;
import com.jk.bean.QueryParam;
import com.jk.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
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

    //跳转到新增页面
    @RequestMapping("addAttr")
    public String addAttr(Integer flb2, Model model) {
        model.addAttribute("flbh2", flb2);
        return "addAttr";
    }


    @RequestMapping("adds")
    public String addAttr(QueryParam queryParam) {

        List<MallValue> attribute = queryParam.getAttr_value();
        Iterator<MallValue> iterator = attribute.iterator();
        while (iterator.hasNext()) {
            MallValue arrt = iterator.next();
            if (arrt.getShxzh() == null) {
                iterator.remove();
            }
        }
        attrService.addAttr(queryParam);

        return "redirect:toshuxing";
    }


}
