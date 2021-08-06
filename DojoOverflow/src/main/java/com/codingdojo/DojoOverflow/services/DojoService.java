package com.codingdojo.DojoOverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.DojoOverflow.models.answers;
import com.codingdojo.DojoOverflow.models.questions;
import com.codingdojo.DojoOverflow.models.tags;
import com.codingdojo.DojoOverflow.repos.answerRepo;
import com.codingdojo.DojoOverflow.repos.questionRepo;
import com.codingdojo.DojoOverflow.repos.tagRepo;

@Service
public class DojoService {
	@Autowired
	private questionRepo qRepo;
	@Autowired
	private answerRepo aRepo;
	@Autowired
	private tagRepo tRepo;
	
	public ArrayList<tags> splitTags(String tags) {
		ArrayList<tags> tagsForQ = new ArrayList<tags>();
		String[] tagsToProcess = tags.split(", ");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				tags tagtoAdd = this.getOneTag(s);
				tagsForQ.add(tagtoAdd);
			}else {
				tags newtag= new tags();
				newtag.setSubject(s);
				this.tRepo.save(newtag);
				tagsForQ.add(newtag);
			}
		}
		return tagsForQ;
	}
	
	public List<questions> Allquestions(){
		return this.qRepo.findAll();
	}
	
	public List<answers> Allanswers(){
		return this.aRepo.findAll();
	}
	
	public List<tags> Alltags(){
		return this.tRepo.findAll();
	}
	
	public questions createQuestion(questions newQuestion) {
		newQuestion.setTags(this.splitTags(newQuestion.getTagsFromFrontEnd()));
		return this.qRepo.save(newQuestion);
	}
	
	public questions getOneQuestion(Long questionId) {
		return this.qRepo.findById(questionId).orElse(null);
	}
	
	public answers createAnswer(answers newAnswer) {
		return this.aRepo.save(newAnswer);
	}
	
	public answers getOneAnswer(Long answerId) {
		return this.aRepo.findById(answerId).orElse(null);
	}
	
	public tags createTag(tags newtag) {
		return this.tRepo.save(newtag);
	}
	
	public tags getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
}
