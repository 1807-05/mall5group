package com.jk.service;

import com.jk.bean.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    void addUser(Gather gather);

    List<Class_1> getClass1();

    List<Class_2> getClass2(Integer flbh1);

    List<Trade_mark> getMark(Integer flbh1);

    List<Attr> getCheckbox(Integer flbh1);

    List querythis(Integer ids);

    void addsku(CopyMallSku mallSku);
}
