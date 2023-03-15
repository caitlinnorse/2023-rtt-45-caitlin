package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
	
//	@ToString.Exclude
//	@LazyCollection(LazyCollectionOption.FALSE)
//	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
//	private List<Course> sCourse;
	
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
	
	 @ToString.Exclude
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	    private List<StudentCourse> studentCourses = new ArrayList<StudentCourse>();
	 
}
