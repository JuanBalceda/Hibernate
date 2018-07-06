package com.balceda.JavaEE_JakartaEE.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_teacher")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTeacher;

	@Column(name = "name")
	private String name;

	@Column(name = "avatar")
	private String avatar;

	private Set<Course> courses;	
	private Set<TeacherSocialMedia> teacheSocialMedias;
	
	public Teacher() {
	}

	public Teacher(long idTeacher, String name, String avatar) {
		super();
		this.idTeacher = idTeacher;
		this.name = name;
		this.avatar = avatar;
	}

	public long getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(long idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<TeacherSocialMedia> getTeacheSocialMedias() {
		return teacheSocialMedias;
	}

	public void setTeacheSocialMedias(Set<TeacherSocialMedia> teacheSocialMedias) {
		this.teacheSocialMedias = teacheSocialMedias;
	}

}
