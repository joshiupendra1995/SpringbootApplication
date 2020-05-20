package com.springboot.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.vo.IsinVO;

@RestController
@RequestMapping("/master")
public class MasterController {

  @GetMapping
	public List<IsinVO> getAllIsins(){

		return null;
		
	}


}
