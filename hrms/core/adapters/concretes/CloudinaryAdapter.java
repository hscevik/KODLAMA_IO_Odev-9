package com.hrms.hrms.core.adapters.concretes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class CloudinaryAdapter {
	
	private String cloudName = "djwyrgoiv";
	private String apiKey = "394556429499126";
	private String apiSecret = "mKiBh3PBRZ8Jq0v6VVv0rWvQGAQ";
	
	
	
	private Cloudinary cloudinaryConfig;
	
	
	@Bean
	public Cloudinary cloudinaryConfig() {
		Cloudinary cloudinary = null;
		
		Map<String ,String> config = new HashMap<>();
		config.put("cloud_name", cloudName);
		config.put("api_key", apiKey);
		config.put("api_secret", apiSecret);
		cloudinary = new Cloudinary(config);
		return cloudinary;
	}
	
	
	

	public String uploadFile(MultipartFile file) {
		try {
			File uploadedFile = convertMultiPartToFile(file);
			
			Map<?, ?> uploadResult = cloudinaryConfig.uploader().upload(uploadedFile, ObjectUtils.emptyMap());
			return uploadResult.get("url").toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	

	
	private File convertMultiPartToFile(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}
	
	
	
	public Map<?, ?> delete (String id) throws IOException {
		Map<?, ?> result = cloudinaryConfig.uploader().destroy(id,ObjectUtils.emptyMap());
		return result;
	}

}
