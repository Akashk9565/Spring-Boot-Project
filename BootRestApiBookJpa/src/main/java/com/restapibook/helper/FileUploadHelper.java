package com.restapibook.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	//public final String UPLOAD_DRI="F:\\Spring Notes\\SpringBoot Practice\\BootRestApiBookJpa\\src\\main\\resources\\static\\image";
	public final String UPLOAD_DRI=new ClassPathResource("/static/image").getFile().getAbsolutePath();
	
	public FileUploadHelper()throws IOException{
		
	}
	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f=false;
		try {
			
			Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DRI+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

