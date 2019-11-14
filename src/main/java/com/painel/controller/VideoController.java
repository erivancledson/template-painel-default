package com.painel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/videos")
public class VideoController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "video/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "video/listar";
	}

}
