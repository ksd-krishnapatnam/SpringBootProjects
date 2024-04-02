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
@Table(name = "customerDt")
@Entity
public class Customer {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long customer_id;
	
	@Column(name = "customer_name")
	private String customer_name;
	
	@Column(name = "mobile_number")
	private Long mobile_number;
	
	@Column(name = "registered_date")
	private Date registered_date;
	
}
