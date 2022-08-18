package com.globallogic.allMapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;



@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column
	long rollno;
	@Column
	double fees;
	@OneToOne(cascade = CascadeType.PERSIST)
	RegisterEntity register;
	@OneToMany(cascade = CascadeType.PERSIST)
	List<AddressEntity> address;
	@ManyToMany(cascade = CascadeType.PERSIST)
	List<TeacherEntity> teacher;
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(long id, long rollno, double fees, RegisterEntity register, List<AddressEntity> address,
			List<TeacherEntity> teacher) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.fees = fees;
		this.register = register;
		this.address = address;
		this.teacher = teacher;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public RegisterEntity getRegister() {
		return register;
	}
	public void setRegister(RegisterEntity register) {
		this.register = register;
	}
	public List<AddressEntity> getAddress() {
		return address;
	}
	public void setAddress(List<AddressEntity> address) {
		this.address = address;
	}
	public List<TeacherEntity> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<TeacherEntity> teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", rollno=" + rollno + ", fees=" + fees + ", register=" + register + "]";
	}

	
	

}
