package com.example.hibernateClass.hibernateClass.Entities;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_info") // This just used to change name of table from employee to emp_info.

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    
    @Column(name = "emp_name",length = 200)
    private  String name;

    @Column(name = "emp_age")
    private int age;
    
    @Lob  
    private  String about;
    
    private boolean active=false;
    
    
    @OneToMany(mappedBy="employee",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<Loan> loan=new ArrayList<>();

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}