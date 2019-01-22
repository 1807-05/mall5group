package com.jk.controller;

import com.jk.service.RepeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("repe")
public class RepeController {

    @Autowired
    private RepeService repeService;



    @RequestMapping("queryProdbyId")
    public List queryProdbyId(Integer id){

        return repeService.queryProdbyId(id);
    }
}
