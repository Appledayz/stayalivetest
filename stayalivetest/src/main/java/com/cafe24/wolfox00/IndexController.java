package com.cafe24.wolfox00;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/index")
	public String index() {
		System.out.println("IndexController.index() GET");
		return "index";
	}
}
