package fr.formation.springData.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="information")
public class Info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private int id;
	
	@Column(name="phone")
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "id_student")
	private Student student;

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", phone=" + phone + "]";
	}
	
	
	
	

}
