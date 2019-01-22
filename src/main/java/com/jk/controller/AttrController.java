package com.jk.controller;

import com.jk.bean.*;
import com.jk.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    public List<Attr> queryAttr(Attr attr,Page page) {

        List<Attr> attrList = attrService.queryAttr(attr,page);

        return attrList;
    }

    //跳转到新增页面
    @RequestMapping("addAttr")
    public String addAttr(Integer flb2, Model model) {
        model.addAttribute("flbh2", flb2);
        return "addAttr";
    }

    //新增
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

    //跳转登陆
    @RequestMapping("tologin")
    public String tologin(){
        return "login";
    }

    //登陆
    @RequestMapping("login")
    @ResponseBody
    public Result login(User user, Model model) {

        User userFromDB = attrService.login(user);
        if (userFromDB == null) {
            return new Result(false, "登录失败!");
        } else {

            return new Result(true, "登录成功");
        }
    }

    //注销
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }


}
