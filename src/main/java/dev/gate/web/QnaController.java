package dev.gate.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dev.gate.domain.Qna;


@Controller
public class QnaController {
	private static final Logger log = LoggerFactory.getLogger(QnaController.class);
	
	private List<Qna> qnas = new ArrayList<>();
	
	
	@PostMapping("/qna/form1")
	public String create(Qna qna,Model model) {
		qnas.add(qna);
		model.addAttribute("qnas", qnas);
		log.info("users size : " + qnas.size());
		log.info("qna : " + qna);
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("qnas", qnas);
		log.info("power log test");
		return "/index";
	}

	

	


}
