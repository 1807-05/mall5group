package com.jk.service;

import com.jk.bean.Page;
import com.jk.bean.Product;
import com.jk.bean.SendPage;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ShopService {
  SendPage queryShop(Page page);

  String addFile(MultipartFile file, HttpServletRequest request);

  void addPro(Product pro);
}
