package com.balceda.JavaEE_JakartaEE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_social_media")
public class TeacherSocialMedia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private long idTeacherSocialMedia;
	
	private Teacher teacher;
	
	private SocialMedia socialMedia;

	public TeacherSocialMedia() {
	}

	public TeacherSocialMedia(long idTeacherSocialMedia, Teacher teacher, SocialMedia socialMedia) {
		super();
		this.idTeacherSocialMedia = idTeacherSocialMedia;
		this.teacher = teacher;
		this.socialMedia = socialMedia;
	}

	public long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}

	public void setIdTeacherSocialMedia(long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

}
