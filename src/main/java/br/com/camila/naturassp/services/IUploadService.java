package br.com.camila.naturassp.services;

import org.springframework.web.multipart.MultipartFile;

public interface IUploadService {
	
	public String uploadFile(MultipartFile arquivo);

}
