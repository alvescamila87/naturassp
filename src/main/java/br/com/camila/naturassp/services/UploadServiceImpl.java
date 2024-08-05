package br.com.camila.naturassp.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServiceImpl implements IUploadService{

	@Override
	public String uploadFile(MultipartFile arquivo) {
		try {
			
			/*
			 * objetivo:
			 * 
			 * copiar o arquivo recebido via requisição para uma pasta definida
			 * e retornar o caminho dele. Se der qualquer erro, retornar NULL.
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
