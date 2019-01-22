package com.jk.controller;

import com.jk.bean.Page;
import com.jk.bean.Product;
import com.jk.bean.SendPage;
import com.jk.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("shop")
public class ShopController {
  @Autowired
  private ShopService shopService;

  @RequestMapping("toUrl")
  public String toUrl(String url){
    return url;
  }

  @RequestMapping("queryShop")
  @ResponseBody
  public SendPage queryShop(Page page){
	 SendPage pag=shopService.queryShop(page);
    return pag;
  }
  @ResponseBody
  @RequestMapping("addFile")
  public String  addFile(MultipartFile file, HttpServletRequest request){

    return shopService.addFile(file, request);
  }
  @ResponseBody
  @RequestMapping("addPro")
  public String addPro(Product pro){
    shopService.addPro(pro);
    return null;
  }
}
