package com.jk.controller;

import com.jk.bean.*;
import com.jk.service.TestService;
import jdk.internal.util.xml.impl.Attrs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("addUser")
    @ResponseBody
    public String addUser(Gather gather){
        testService.addUser(gather);

            return "1";
    }
    @RequestMapping("getClass1")
    @ResponseBody
    public List<Class_1> getClass1(){

        return  testService.getClass1();
    }

    @RequestMapping("getClass2")
    @ResponseBody
    public List<Class_2> getClass2(Integer flbh1){

        return  testService.getClass2(flbh1);
    }
    @ResponseBody
    @RequestMapping("getMark")
    public List<Trade_mark> getMark(Integer flbh1){

        return   testService.getMark(flbh1);
    }
    //去新增页面
    @RequestMapping("toAddJsp")
    public String toAddJsp(){

        return   "addProduce";
    }
    @RequestMapping("getCheckbox")
    @ResponseBody
    public List<Attr> getCheckbox(Integer flbh1){
        List<Attr> attrs = testService.getCheckbox(flbh1);
        return attrs;
    }
    @ResponseBody
    @RequestMapping("querythis")
    public List querythis(Integer ids) {
        return testService.querythis(ids);
    }
    @ResponseBody
    @RequestMapping("addsku")
    public String addsku(CopyMallSku mallSku){
        testService.addsku(mallSku);
        return  "1";
    }
}
