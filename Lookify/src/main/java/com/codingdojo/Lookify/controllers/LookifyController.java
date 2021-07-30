package com.codingdojo.Lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.Lookify.models.LookifyModel;
import com.codingdojo.Lookify.services.LookifyService;

@Controller
public class LookifyController {
	private LookifyService service;
	public LookifyController(LookifyService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model viewModel) {
		viewModel.addAttribute("songlist", this.service.getAll());
		return "dashboard.jsp";
	}
	
	@RequestMapping("/{id}")
	public String getSong(@PathVariable Long id, Model viewModel) {
		viewModel.addAttribute("song", this.service.getSong(id));
		return "song.jsp";
	}
	
	@RequestMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		service.songDelete(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/addNew")
	public String addNew(@ModelAttribute("song")LookifyModel songs) {
		return "addSong.jsp";
	}
	
	@RequestMapping(value="/addNew/create", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") LookifyModel songs, BindingResult result) {
		if (result.hasErrors()) {
			return "addSong.jsp";
			}
		else {
			service.create(songs);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("artist") String artist, Model viewModel) {
		viewModel.addAttribute("songbyartist", this.service.searchArtist(artist));
		viewModel.addAttribute("artist", artist);
		return "artist.jsp";
	}
	
	@RequestMapping("/topTen")
	public String TopTen(Model model) {
		model.addAttribute("songs", this.service.topTenByRating());
		return "topTen.jsp";
	}
}
