package com.jk.service.impl;

import com.github.pagehelper.PageHelper;
import com.jk.bean.Page;
import com.jk.bean.Product;
import com.jk.bean.SendPage;
import com.jk.mapper.ShopMapper;
import com.jk.service.ShopService;

import com.jk.utils.FileUtil;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServcieImpl implements ShopService {
  @Resource
  private ShopMapper shopMapper;

  @Override
  public SendPage queryShop(Page page) {
	 List<Product> count = shopMapper.queryShop(); //计算数据库符合条件的总条数   条数是固定的

	 PageHelper.startPage(page.getPage(),page.getRows());
	 List<Product> list = shopMapper.queryShop(); //当前页面数据 其大小取决于 每页多少条

	 SendPage sendPage = new SendPage(count.size(),list);

	 return sendPage;

  }

  @Override
  public String addFile(MultipartFile file, HttpServletRequest request) {
    return FileUtil.upload(file,request);
  }

  @Override
  public void addPro(Product pro) {


    shopMapper.addPro(pro);
   Product po =shopMapper.getPro(pro.getShp_mch());

	 String ad=pro.getShp_tp();
	 String [] arr=ad.split(",");
	 for(int i=0;i<arr.length;i++){
		shopMapper.addPho(po.getId(),arr[i]);
	 }

  }
}
