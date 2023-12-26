package com.example.demo.student;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("StudentDTO")
public class StudentDTO {
	
	private int id;
	private String name;
	private int studentId;          // 학번
	private int age;
	private Boolean isMale;         // 성별 (true: 남성, false: 여성)
	private int grade;            // 학년
	private Boolean isAttending;    // 재학 여부
	private List<String> clubs;     // 참여 활동
	private String major;           // 전공

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getMale() {
		return isMale;
	}

	public void setMale(Boolean male) {
		isMale = male;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Boolean getAttending() {
		return isAttending;
	}

	public void setAttending(Boolean attending) {
		isAttending = attending;
	}

	public List<String> getClubs() {
		return clubs;
	}

	public void setClubs(List<String> clubs) {
		this.clubs = clubs;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
