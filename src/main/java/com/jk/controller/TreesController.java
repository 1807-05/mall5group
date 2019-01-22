package com.jk.controller;

import com.jk.bean.Trees;
import com.jk.service.TreesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreesController {
    @Autowired
    TreesService treesService;

    //树
    @ResponseBody
    @RequestMapping("queryTreeLeft")
    public List<Trees> queryTreeLeft() {

        return treesService.queryTreeLeft();
    }



    @RequestMapping("index")
    public String index(){

        return "index";
    }




}
