package com.codingdojo.LicenseAssignment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class license {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expiration_date;
    private String state;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private person person;
    
    
    public license() {
        
    }
    
	public license(int number, Date expiration_date, String state,
			com.codingdojo.LicenseAssignment.models.person person) {
		
		this.number = number;
		this.expiration_date = expiration_date;
		this.state = state;
		this.person = person;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public person getPerson() {
		return person;
	}

	public void setPerson(person person) {
		this.person = person;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public String returnlicenseNumbers() {
		int num = 7 - Integer.toString(this.number).length();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			sb.append(0);
		}
		return String.format("%s%d", sb, this.number);
	}
}