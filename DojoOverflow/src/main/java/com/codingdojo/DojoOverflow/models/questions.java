package com.codingdojo.DojoOverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="questions")
public class questions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String questioninfo;
	
	@Transient
	private String tagsFromFrontEnd;
	
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
	
	@OneToMany(mappedBy="question", fetch = FetchType.LAZY)
    private List<answers> answer;
	
    
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tags_questions", 
        joinColumns = @JoinColumn(name = "question_id"), 
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
	private List<tags> tags;
	
	public questions() {
	}
	
	public questions(String questioninfo, List<tags> tags) {
		this.questioninfo = questioninfo;
		this.tags = tags;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestioninfo() {
		return questioninfo;
	}

	public void setQuestioninfo(String questioninfo) {
		this.questioninfo = questioninfo;
	}

	public String getTagsFromFrontEnd() {
		return tagsFromFrontEnd;
	}

	public void setTagsFromFrontEnd(String tagsFromFrontEnd) {
		this.tagsFromFrontEnd = tagsFromFrontEnd;
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

	public List<answers> getAnswer() {
		return answer;
	}

	public void setAnswer(List<answers> answer) {
		this.answer = answer;
	}

	public List<tags> getTags() {
		return tags;
	}

	public void setTags(List<tags> tags) {
		this.tags = tags;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
