package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.utils.RestTemplateUtil;
import com.example.demo.vo.JsonVo;
import com.example.demo.vo.XmlVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RestTemplateService {
	
	public XmlVo getXmlData() {
		return RestTemplateUtil.getXmlResponse();
	}
	
	public JsonVo getJsonData() {
		return RestTemplateUtil.getJsonRsponse();
	}
	
	public ResponseEntity<String> getEntity(String key) {
		return RestTemplateUtil.getResponseEntity(key);
	}
	
	public ResponseEntity<String> addData() {
		return RestTemplateUtil.post();
	}

}
