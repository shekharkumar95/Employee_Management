package com.example.backend.modle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY  )
	private long id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "salary")
	private String salary;

	public Employee() {
		
	}
	
	
	public Employee( String firstName, String email, String address, String mobile, String salary) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.salary = salary;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", firstName=" + firstName + ", email=" + email + ", address=" + address
//				+ ", mobile=" + mobile + ", salary=" + salary + "]";
//	}
//	
	
	
	
	
	
	
	
}
