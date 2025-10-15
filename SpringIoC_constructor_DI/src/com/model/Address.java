package com.model;

public class Address {
	
	private int pincode;
	private String area;
	private String city;
	
	public int getPincode() {
		return pincode;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", area=" + area + ", city=" + city + "]";
	}

	public Address(int pincode, String area, String city) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.city = city;
	}

	
}
