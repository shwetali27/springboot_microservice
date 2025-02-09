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
public class Students {
	private int studentId;
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
    private Date enrollmentDate;
    private String gradeLevel;
    private String classroomTeacher;
    private String homeroomTeacherEmail;
    private String guardianName;
    private String guardianPhoneNumber;
    private String guardianEmail;
    private String relationshipToStudent;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String medicalConditions;
    private String allergies;
    private String profilePictureUrl;
    private String extracurricularActivities;
    private String attendanceStatus;
    private Date createdAt;
    private Date updatedAt;
}
