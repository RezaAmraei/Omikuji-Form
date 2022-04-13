package com.codingdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
@GetMapping("/")
public String index() {
	return "redirect:/omikuji";
}
@GetMapping("/omikuji")
public String omikuji() {
	return "index.jsp";
}
@PostMapping("/omikuji/render")
public String render(
		@RequestParam(value="number") Integer number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="pet") String pet,
		@RequestParam(value="nice") String nice,
		HttpSession session) {
	session.setAttribute("number", number);
	session.setAttribute("city", city);
	session.setAttribute("person", person);
	session.setAttribute("hobby", hobby);
	session.setAttribute("pet", pet);
	session.setAttribute("nice", nice);
	return "redirect:/omikuji/show";
}
@GetMapping("/omikuji/show")
public String show(Model model, HttpSession session) {
	model.addAttribute("number", session.getAttribute("number"));
	model.addAttribute("city", session.getAttribute("city"));
	model.addAttribute("person", session.getAttribute("person"));
	model.addAttribute("hobby", session.getAttribute("hobby"));
	model.addAttribute("pet", session.getAttribute("pet"));
	model.addAttribute("nice", session.getAttribute("nice"));
	return "show.jsp";
}
}
