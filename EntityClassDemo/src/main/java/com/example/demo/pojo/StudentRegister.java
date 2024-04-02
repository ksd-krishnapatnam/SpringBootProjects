package com.example.demo.pojo;

import java.util.Date;

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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studentRegisterationDetails")
@Entity
public class StudentRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long student_id;

	@Column(name="student_name")
	private String student_name;
	
	@Column (name = "mobile_number")
	private Long mobile_number;
	
	@Column (name = "email_id")
	private String email_id;
	
	@Column (name = "registered_date")
	private Date registered_date;
	
	@Column (name = "status")
	private Boolean status;

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(Long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Date getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

		
}
