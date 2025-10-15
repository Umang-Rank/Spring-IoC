package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	
	private int pid;
	private String pname;
	
	private Address adr;
	
	private List<String> email;
	private Set<Long> contact;
	private Map<String, Double> marks;
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", adr=" + adr + ", email=" + email + ", contact=" + contact
				+ ", marks=" + marks + "]";
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public Address getAdr() {
		return adr;
	}

	public List<String> getEmail() {
		return email;
	}

	public Set<Long> getContact() {
		return contact;
	}

	public Map<String, Double> getMarks() {
		return marks;
	}

	public Person(int pid, String pname, Address adr, List<String> email, Set<Long> contact,
			Map<String, Double> marks) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.adr = adr;
		this.email = email;
		this.contact = contact;
		this.marks = marks;
	}

}
