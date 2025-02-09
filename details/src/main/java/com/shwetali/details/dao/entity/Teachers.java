package com.shwetali.details.dao.entity;

import java.util.Date;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="students")
public class Teachers {

	private int teacherId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String gender;
	private Date dateOfBirth;
	private String nationality;
	private String email;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private Date hireDate;
	private String department;
	private String jobTitle;
	private double salary;
	private boolean isFullTime;
	private Date dateOfJoining;
	private String highestQualification;
	private String qualifications;
	private int yearsOfExperience;
	private String subjectsTaught;
	private String teachingStyle;
	private String emergencyContactName;
	private String emergencyContactPhone;
	private String profilePictureUrl;
	private String socialMediaLinks;
	private String status;
	private Date createdAt;
	private Date updatedAt;
}
