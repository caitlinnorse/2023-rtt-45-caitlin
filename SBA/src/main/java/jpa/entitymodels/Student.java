package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="email")
	private String sEmail;
	
	
	@Column(name="name")
	private String sName;
	

	@Column(name="password")
	private String sPass;
	
	public List<Course> sCourse = new ArrayList<Course>();
	
	public Student() {
		this.id = 0;
		this.sEmail = "";
		this.sName = "";
		this.sPass = "";
		
	}
	
	public Student(int id, String sEmail, String sName, String sPass) {
		this.id = id;
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
	}

}
