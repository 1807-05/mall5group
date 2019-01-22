package com.jk.service.impl;

import com.jk.mapper.RepeMapper;
import com.jk.service.RepeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepeServiceImpl implements RepeService {

    @Autowired
    private RepeMapper repeMapper;

    @Override
    public List queryProdbyId(Integer id) {

        return repeMapper.queryProdbyId(id);
    }
}
