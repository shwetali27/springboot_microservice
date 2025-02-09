# springboot_microservice
Spring Boot microservice applications with spring security, spring cloud components


#---------------- database tables info -----------------------

#----- teachers table
CREATE TABLE teachers (
    teacher_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    middle_name VARCHAR(100),
    gender ENUM('Male', 'Female', 'Other', 'Prefer not to say'),
    date_of_birth DATE,
    nationality VARCHAR(100),
    email VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    postal_code VARCHAR(20),
    country VARCHAR(100),
    hire_date DATE,
    department VARCHAR(100),
    job_title VARCHAR(100),
    salary DECIMAL(10, 2),
    is_full_time BOOLEAN DEFAULT TRUE,
    date_of_joining DATE,
    highest_qualification VARCHAR(255),
    qualifications TEXT, -- for listing all qualifications or certifications
    years_of_experience INT,
    subjects_taught TEXT, -- a list of subjects they teach
    teaching_style VARCHAR(255),
    emergency_contact_name VARCHAR(100),
    emergency_contact_phone VARCHAR(20),
    profile_picture_url VARCHAR(255),
    social_media_links TEXT, -- e.g., LinkedIn, Twitter
    status ENUM('Active', 'Inactive', 'On Leave', 'Retired'),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

#----- students table
CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    middle_name VARCHAR(100),
    gender ENUM('Male', 'Female', 'Other', 'Prefer not to say'),
    date_of_birth DATE,
    nationality VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    phone_number VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    postal_code VARCHAR(20),
    country VARCHAR(100),
    enrollment_date DATE,
    grade_level ENUM('Kindergarten', '1st Grade', '2nd Grade', '3rd Grade', '4th Grade', '5th Grade', '6th Grade', '7th Grade', '8th Grade', '9th Grade', '10th Grade', '11th Grade', '12th Grade'),
    classroom_teacher VARCHAR(100), 
    homeroom_teacher_email VARCHAR(100),
    guardian_name VARCHAR(100),
    guardian_phone_number VARCHAR(20),
    guardian_email VARCHAR(100),
    relationship_to_student ENUM('Mother', 'Father', 'Guardian', 'Other'),
    emergency_contact_name VARCHAR(100),
    emergency_contact_phone VARCHAR(20),
    medical_conditions TEXT, -- Health conditions or special needs
    allergies TEXT, -- Any allergies the student may have
    profile_picture_url VARCHAR(255),
    extracurricular_activities TEXT, -- List of extracurricular activities or clubs
    attendance_status ENUM('Active', 'Inactive', 'Transferred', 'Graduated'),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);



#------------------------------------------- sample insert scripts
INSERT INTO teachers (
    first_name, last_name, middle_name, gender, date_of_birth, nationality, email, phone_number, address, city, state, postal_code, country, hire_date, department, job_title, salary, is_full_time, date_of_joining, highest_qualification, qualifications, years_of_experience, subjects_taught, teaching_style, emergency_contact_name, emergency_contact_phone, profile_picture_url, social_media_links, status, created_at, updated_at
)
VALUES
('John', 'Doe', 'Smith', 'Male', '1980-05-15', 'American', 'johndoe@email.com', '123-456-7890', 
 '123 Elm St', 'Springfield', 'IL', '62701', 'USA', '2010-08-01', 'Mathematics', 'Math Teacher', 
 50000.00, TRUE, '2010-08-01', 'M.Sc in Mathematics', 'B.Sc in Mathematics, M.Sc in Applied Mathematics', 
 15, 'Algebra, Calculus, Geometry', 'Interactive, Lecture-Based', 'Jane Doe', '987-654-3210', 
 'http://example.com/profile.jpg', 'https://linkedin.com/in/johndoe', 'Active', 
 CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
 
('Jane', 'Smith', 'Ann', 'Female', '1985-10-20', 'Canadian', 'janesmith@email.com', '234-567-8901', 
 '456 Oak St', 'Toronto', 'ON', 'M5A 1A1', 'Canada', '2015-09-01', 'Science', 'Science Teacher', 
 55000.00, TRUE, '2015-09-01', 'M.Sc in Physics', 'B.Sc in Physics, M.Sc in Quantum Mechanics', 
 10, 'Physics, Chemistry', 'Practical, Experiment-Based', 'John Smith', '654-321-0987', 
 'http://example.com/profile2.jpg', 'https://twitter.com/janesmith', 'Active', 
 CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

# ------------------------------------------------------
INSERT INTO students (
    first_name, last_name, middle_name, gender, date_of_birth, nationality, email, phone_number, address, city, state, postal_code, country, enrollment_date, grade_level, classroom_teacher, homeroom_teacher_email, guardian_name, guardian_phone_number, guardian_email, relationship_to_student, emergency_contact_name, emergency_contact_phone, medical_conditions, allergies, profile_picture_url, extracurricular_activities, attendance_status, created_at, updated_at
)
VALUES
('Alice', 'Johnson', 'Marie', 'Female', '2010-04-12', 'American', 'alice.johnson@email.com', '555-123-4567', 
 '789 Pine St', 'Springfield', 'IL', '62704', 'USA', '2015-08-20', '5th Grade', 'Mr. Smith', 'mrsmith@email.com',
 'Mary Johnson', '555-987-6543', 'mary.johnson@email.com', 'Mother', 'John Johnson', '555-555-1234', 
 'No known medical conditions', 'Peanut allergy', 'http://example.com/alice_profile.jpg', 
 'Soccer, Drama Club', 'Active', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
 
('James', 'Williams', 'Lee', 'Male', '2009-07-30', 'Canadian', 'james.williams@email.com', '555-234-5678', 
 '321 Maple St', 'Toronto', 'ON', 'M5A 1B2', 'Canada', '2014-09-10', '6th Grade', 'Ms. Johnson', 'msjohnson@email.com',
 'David Williams', '555-876-5432', 'david.williams@email.com', 'Father', 'Sophia Williams', '555-654-3210', 
 'Asthma', 'No known allergies', 'http://example.com/james_profile.jpg', 
 'Chess Club, Basketball', 'Active', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
#-----------------------------------------------------

