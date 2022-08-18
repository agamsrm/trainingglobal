package com.globallogic.allMapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	String city;
	@Column
	String state;
	
	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressEntity(long id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", state=" + state + "]";
	}
	

}
