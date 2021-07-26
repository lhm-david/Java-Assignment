package com.codingdojo.LearningPlatformAssignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{part3}")
	public String showAssignment(Model viewModel, @PathVariable("chapter") String discard, @PathVariable("part3") String productID) {
		viewModel.addAttribute("assignmentinfo", "The Goal of this Assignment is to...");
		if (discard != null) {
			switch (productID) {
			case "0345":
				return "CodingForm.jsp";
			case "2342":
				return "Binary.jsp";
			default :
				return "redirect:/";
			}
		}else {
				return "redirect:/";
		}
	}
	
	@RequestMapping("/m/{chapter}/0553/{part3}")
	public String showLesson(Model viewModel, @PathVariable("chapter") String discard, @PathVariable("part3") String productID) {
		viewModel.addAttribute("lessoninfo", "Lesson content placeholder.");
		if (discard != null) {
			switch (productID) {
			case "0733":
				return "SetupServer.jsp";
			case "0342":
				return "PunchCards.jsp";
			case "0348":
				return "AdvancedFortranIntro.jsp";
			default :
				return "redirect:/";
			}
		}else {
				return "redirect:/";
		}
	}
	
	@RequestMapping("/m/{chapter}/0123/{part3}")
	public String quiz (Model viewModel, @PathVariable("chapter") String discard, @PathVariable("part3") String productID) {
		viewModel.addAttribute("quizinfo", "Quiz info placeholder");
		if (discard != null) {
			switch (productID) {
			case "1":
				return "quiz.jsp";
			default :
				return "redirect:/";
			}
		}else {
			return "redirect:/";
		}
	}
}


