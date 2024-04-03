package com.example.demo.controller;
import java.util.Date;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EnableAutoConfiguration
@Table(name="User")
@Entity
//UserTable
//test
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "Gmail")
	private String gmail;
	@Column(name = "Contact")
	private Integer contact;
	@Column(name = "Graduation")
	private String graduation;
	@Column(name = "PassedOutYear")
	private Short passedOutYear;
	@Column(name = "Grade")
	private Character grade;
	@Column(name = "Percentage")
	private Float percentage;
	@Column(name = "Date")
	private Date date;
	@Column(name = "Status")
	private Boolean status;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public Short getPassedOutYear() {
		return passedOutYear;
	}
	public void setPassedOutYear(Short passedOutYear) {
		this.passedOutYear = passedOutYear;
	}
	public Character getGrade() {
		return grade;
	}
	public void setGrade(Character grade) {
		this.grade = grade;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	

}
