package com.jk.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 * 项目名称：springmvc_upload    
 * 类名称：FileUtil    
 * 类描述：    
 * 创建人：wzstart    
 * 创建时间：2018-10-13 上午9:41:30    
 * 修改人：wzstart  
 * 修改时间：2018-10-13 上午9:41:30    
 * 修改备注：       
 * @version
 * </pre>
 */
public class FileUtil {

	/**
	 * <pre>
	 * upload(这里用一句话描述这个方法的作用)   
	 * 创建人：wzstart     
	 * 创建时间：2018-10-13 上午9:43:06    
	 * 修改人：wzstart      
	 * 修改时间：2018-10-13 上午9:43:06    
	 * 修改备注：
	 * </pre>
	 */
	public static String upload(MultipartFile file, HttpServletRequest request) {

		if (file != null && file.getSize() > 0) {
			// 上传文件的名字
			String name = file.getOriginalFilename();
			// 获取后缀名
			String suffix = name.substring(name.lastIndexOf("."));
			// 生成唯一标示
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = new Date();
			// 文件名 唯一
			String prefix = format.format(date);

			String realPath = request.getServletContext().getRealPath("upload");

			File fileTemp = new File(realPath, prefix + suffix);
			// model.addAttribute("name", prefix + suffix);
			/*if (!fileTemp.exists()) {
				fileTemp.mkdirs();
			}*/
			if (!fileTemp.getParentFile().exists()) {
				fileTemp.getParentFile().mkdirs();
				try {
					fileTemp.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				file.transferTo(fileTemp);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prefix + suffix;
		} else {
			return "not found";
		}

	}

	/**
	 * <pre>
	 * download(这里用一句话描述这个方法的作用)   
	 * 创建人：wzstart     
	 * 创建时间：2018-10-13 上午9:56:48    
	 * 修改人：wzstart      
	 * 修改时间：2018-10-13 上午9:56:48    
	 * 修改备注：
	 * </pre>
	 */
	/*public static ResponseEntity<byte[]> download(HttpServletRequest request, String filename) {
		// 获取文件的在服务器地址
		String realPath = request.getServletContext().getRealPath("upload");
		// 要下载的文件对象
		File downloadFile = new File(realPath, filename);

		// 设置http的响应头
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment", filename);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		// 设置下载的内容
		ResponseEntity<byte[]> entity = null;
		try {
			entity = new ResponseEntity<byte[]>(
					FileUtils.readFileToByteArray(downloadFile), headers,
					HttpStatus.CREATED);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entity;
	}*/

}
