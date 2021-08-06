package com.codingdojo.DojoOverflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table(name="answers")
public class answers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String answerinfo;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="question_id")
    private questions question;
	
	public answers() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswerinfo() {
		return answerinfo;
	}

	public void setAnswerinfo(String answerinfo) {
		this.answerinfo = answerinfo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public questions getQuestion() {
		return question;
	}

	public void setQuestion(questions question) {
		this.question = question;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PostUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}
