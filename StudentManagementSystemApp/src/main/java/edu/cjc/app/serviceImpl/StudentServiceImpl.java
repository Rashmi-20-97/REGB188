package edu.cjc.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.app.model.Student;
import edu.cjc.app.repository.StudentRepository;
import edu.cjc.app.servicei.StudentServicei;

@Service
public class StudentServiceImpl implements StudentServicei {
@Autowired 
StudentRepository sr;

public void saveStudentDetails(Student st) {
	sr.save(st);
}
@Override
public List<Student> getAllStudents() {
	return (List<Student>) sr.findAll();
}

@Override
public List<Student> searchStudentsByBatch(String batchNumber) {
	return sr.findAllByBatchNumber(batchNumber);
}
@Override
public Student getSingleObject(int rollNo) {
	return sr.findById(rollNo).get();
}

@Override
public void updateStudentFees(int rollNo, double ammount) {
	 Student   s  = sr.findById(rollNo).get();
	 s.setFeesPaid(s.getFeesPaid()+ammount);
         sr.save(s);		             
}

@Override
public void deleteStudent(int rollNo) {
             sr.deleteById(rollNo);		
}
}
