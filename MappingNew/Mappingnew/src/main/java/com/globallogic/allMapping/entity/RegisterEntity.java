package com.globallogic.allMapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class RegisterEntity {	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	String course;
	
	
	public RegisterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterEntity(long id, String course) {
		super();
		this.id = id;
		this.course = course;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "RegisterEntity [id=" + id + ", course=" + course + "]";
	}

	

}
