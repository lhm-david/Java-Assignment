package com.codingdojo.DojoOverflow.validator;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.codingdojo.DojoOverflow.models.questions;

@Component
public class TagValidation {
	public boolean supports(Class<?> clazz) {
		return Question.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		questions question = (questions) target;
		
		String[] tags = question.getTagsFromFrontEnd().split(", ");
		if(tags.length > 3) {
			errors.rejectValue("tagsFromFrontEnd", "too Many", "Must have 3 or less");
		}
	}
}
