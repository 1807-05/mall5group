package com.jk.mapper;

import com.jk.bean.Trees;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreesMapper {


    List<Trees> queryTreeLeft(@Param("id") Integer pid);

}
