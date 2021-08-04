package com.codingdojo.LicenseAssignment.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	
    
    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public license license;
    
    @Column(updatable=false)
	private Date createdAt;
    private Date updatedAt;
    public person() {
    	
    }
    @PrePersist
    protected void onCreate() {
    	this.createdAt = new Date();
    }
    	
    @PreUpdate
    protected void onUpdate() {
    	this.updatedAt = new Date();
    }    
    
	public person(String firstname, String lastname, com.codingdojo.LicenseAssignment.models.license license) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.license = license;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public license getLicense() {
		return license;
	}
	public void setLicense(license license) {
		this.license = license;
	}
	
}
