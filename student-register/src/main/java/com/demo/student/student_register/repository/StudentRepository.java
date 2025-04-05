package com.demo.student.student_register.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.student.student_register.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	Optional<Student> findByEmail(String email);
}
