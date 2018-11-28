package com.cafe24.wolfox00.user.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.wolfox00.user.Service.UserService;
import com.cafe24.wolfox00.user.vo.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/userList")
	public String userList(Model model) {
		System.out.println("UserController.userList() GET");
		long date = System.currentTimeMillis();
		model.addAttribute("userList", userService.userList());
		model.addAttribute("date", date);
		System.out.println("date : "+date);
		return "userList";
	}
	@GetMapping("/login")
	public String login() {
		System.out.println("LoginController.login GET요청");
		return "login";
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, User user) {
		System.out.println("LoginController.login POST요청");
		if(userService.login(user)==1) {
			System.out.println("session S_ID 저장 : "+user.getId());
			session.setAttribute("S_ID", user.getId());
			return "redirect:/userList";
		}else {
			return "redirect:/login";
		}
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/userList";
	}
	
}
