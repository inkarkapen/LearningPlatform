package com.inkarkapen.platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlatformController {
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
	}
	@RequestMapping("/m/{chapter}/0483/{assignment}")
	public String assignment() {
		return "assignment.jsp";
	}
	@RequestMapping("/m/{chapter}/0553/{lesson}")
	public String lesson() {
		return "lesson.jsp";
	}
}
