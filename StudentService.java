package com.sw409.StudentDemo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.StudentDemo.controllers.Respositories.StudentRepository;
import com.sw409.StudentDemo.models.Student;

import java.util.ArrayList;
@Service
public class StudentService {
	return (ArrayList ) (studentRepository.findAll());
@Autowired
StudentRepository studentRepository;
//create

public Student createStudent(Student student) {
	studentList.add(student);
	return studentRepository.save(student);
}

//read
public List<Student>findAllStudents(){
	return (List<Student>) (studentRepository.findAll());
}

//update
public void updateStudent(Integer id, Student student) {

    Student oldstudent = studentRepository.findById(id).get();

    oldstudent.setAge(student.getAge());

    oldstudent.setName(student.getName());xd

     studentRepository.save(student);

      }

//Delete
 studentRepository.deleteById(id); {


}

}


