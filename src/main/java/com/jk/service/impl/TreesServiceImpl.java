package com.jk.service.impl;

import com.jk.bean.Trees;
import com.jk.mapper.TreesMapper;
import com.jk.service.TreesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreesServiceImpl implements TreesService {
    @Autowired
    TreesMapper treesMapper;

    //树 main queryTreeLeft
    @Override
    public List<Trees> queryTreeLeft() {
        List<Trees> list = treesMapper.queryTreeLeft(0);
        getTreeByState(list);
        return list;
    }

    private void getTreeByState(List<Trees> list) {
        for (Trees permission : list) {
            List<Trees> date = treesMapper.queryTreeLeft(permission.getId());
            getTreeByState(date);
            permission.setChildren(date);
        }

    }




}
