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
@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer cId;
	
	@Column(name="name")
	private String cName;
	
	@Column(name="instructor")
	private String cInstructorName;
	
	
	 @ToString.Exclude
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	    private List<StudentCourse> studentCourses = new ArrayList<StudentCourse>();
	 
	 public Course() {
		 this.cId = 0;
		 this.cName = "";
		 this.cInstructorName = "";
	 }
	 
	 public Course(int id, String cName, String cInstructorName) {
		 this.cId = id;
		 this.cName = cName;
		 this.cInstructorName = cInstructorName;
	 }
}

	
