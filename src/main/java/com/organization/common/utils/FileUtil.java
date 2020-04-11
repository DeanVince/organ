package com.organization.common.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.UUID;

public class FileUtil {

	public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
		File targetFile = new File(filePath);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		FileOutputStream out = new FileOutputStream(filePath + fileName);
		out.write(file);
		out.flush();
		out.close();
	}

	public static boolean deleteFile(String fileName) {
		File file = new File(fileName);
		// 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
		if (file.exists() && file.isFile()) {
			if (file.delete()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static String renameToUUID(String fileName) {
		return UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
	}


	public static void downloadLocal(HttpServletResponse response , String path, String fileName,String name) throws FileNotFoundException, UnsupportedEncodingException {
		// 读到流中
		// 文件的存放路径
		if(fileName.startsWith("/files/")){
			fileName = fileName.substring(7);
		}
		InputStream inStream = new FileInputStream(path + File.separator+fileName);
		// 设置输出的格式
		response.reset();
		response.setContentType("bin");
		response.addHeader("Content-Disposition", "attachment; filename=\"" + URLEncoder.encode(name, "UTF-8") + "\"");
		// 循环取出流中的数据
		byte[] b = new byte[100];
		int len;
		try {
			while ((len = inStream.read(b)) > 0) {

				response.getOutputStream().write(b, 0, len);
			}
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
